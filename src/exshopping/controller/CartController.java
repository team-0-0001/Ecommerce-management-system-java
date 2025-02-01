package exshopping.controller;

import exshopping.model.CartItem;
import exshopping.model.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CartController {

	public static void clearAllCartData() {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "TRUNCATE TABLE cart";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	};

	public static void removeCartItem(int cartId) {

		// Get product details to remove from cart
		int userId = AuthenticationController.getUserId();

		// Remove from database cart
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "DELETE FROM cart WHERE user_id = ? AND cart_id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, cartId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void addToCart(int userId, int productId, double quantity) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			// Verify user exists
			String userCheckQuery = "SELECT COUNT(*) FROM users WHERE id = ?";
			PreparedStatement userCheckStmt = conn.prepareStatement(userCheckQuery);
			userCheckStmt.setInt(1, userId);
			ResultSet userRs = userCheckStmt.executeQuery();

			if (!userRs.next() || userRs.getInt(1) == 0) {
				JOptionPane.showMessageDialog(null, "Invalid User!");
				return;
			}

			// Check if product already in cart for this user
			String checkQuery = "SELECT cart_id, quantity FROM cart WHERE user_id=? AND product_id=?";
			PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
			checkStmt.setInt(1, userId);
			checkStmt.setInt(2, productId);

			ResultSet rs = checkStmt.executeQuery();

			if (rs.next()) {
				// Update existing cart item
				int cartId = rs.getInt("cart_id");
				double existingQuantity = rs.getDouble("quantity");

				String updateQuery = "UPDATE cart SET quantity=? WHERE cart_id=?";
				PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
				updateStmt.setDouble(1, existingQuantity + quantity);
				updateStmt.setInt(2, cartId);
				updateStmt.executeUpdate();
			} else {
				// Insert new cart item
				String insertQuery = "INSERT INTO cart (user_id, product_id, quantity) VALUES (?, ?, ?)";
				PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
				insertStmt.setInt(1, userId);
				insertStmt.setInt(2, productId);
				insertStmt.setDouble(3, quantity);
				insertStmt.executeUpdate();
			}

			JOptionPane.showMessageDialog(null, "Product Added to Cart!");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error Adding to Cart: " + e.getMessage());
		}
	}

	// Comprehensive cart retrieval with product details
	public static List<CartItem> getUserCart(int userId) {
		List<CartItem> cartItems = new ArrayList<>();
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT "
					+ "c.cart_id, "
					+ "p.product_id, "
					+ "p.product_name, "
					+ "p.price, "
					+ "c.quantity, "
					+ "p.image_path "
					+ // Added image path retrieval
					"FROM cart c "
					+ "JOIN products p ON c.product_id = p.product_id "
					+ "WHERE c.user_id = ?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				CartItem item = new CartItem(
						rs.getInt("cart_id"),
						rs.getInt("product_id"),
						rs.getString("product_name"),
						rs.getDouble("price"),
						rs.getInt("quantity"),
						rs.getString("image_path") // Added image path
				);
				cartItems.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cartItems;
	}

	// Additional method to calculate total cart value
	public static double getCartTotal(int userId) {
		double total = 0.0;
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT SUM(p.price * c.quantity) as total "
					+ "FROM cart c "
					+ "JOIN products p ON c.product_id = p.product_id "
					+ "WHERE c.user_id = ?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				total = rs.getDouble("total");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
}
