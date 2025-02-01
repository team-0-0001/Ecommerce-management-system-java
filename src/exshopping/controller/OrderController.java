/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exshopping.controller;

import exshopping.model.CartItem;
import exshopping.model.DatabaseConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sanbid
 */
public class OrderController {

	public static int createOrder(int userId) {
		int orderId = -1;
		try (Connection conn = DatabaseConnection.getConnection()) {
			conn.setAutoCommit(false);

			// Get cart items
			List<CartItem> cartItems = CartController.getUserCart(userId);

			// Calculate total amount
			double totalAmount = cartItems.stream()
					.mapToDouble(item -> item.getPrice() * item.getQuantity())
					.sum();

			// Insert order
			String orderQuery = "INSERT INTO orders (user_id, total_amount) VALUES (?, ?)";
			PreparedStatement orderStmt = conn.prepareStatement(orderQuery, Statement.RETURN_GENERATED_KEYS);
			orderStmt.setInt(1, userId);
			orderStmt.setDouble(2, totalAmount);
			orderStmt.executeUpdate();

			// Get generated order ID
			ResultSet rs = orderStmt.getGeneratedKeys();
			if (rs.next()) {
				orderId = rs.getInt(1);
			}

			// Insert order items
			String itemQuery = "INSERT INTO order_items (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
			PreparedStatement itemStmt = conn.prepareStatement(itemQuery);

			for (CartItem item : cartItems) {
				itemStmt.setInt(1, orderId);
				itemStmt.setInt(2, item.getProductId());
				itemStmt.setInt(3, item.getQuantity());
				itemStmt.setDouble(4, item.getPrice());
				itemStmt.executeUpdate();
			}

			// Clear user's cart
			String clearCartQuery = "DELETE FROM cart WHERE user_id = ?";
			PreparedStatement clearStmt = conn.prepareStatement(clearCartQuery);
			clearStmt.setInt(1, userId);
			clearStmt.executeUpdate();

			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orderId;
	}

	public List<OrderHistory> getAllOrderHistory(int userID) {
		List<OrderHistory> orderHistories = new ArrayList<>();
		String query = "SELECT order_id, order_date, total_amount FROM orders WHERE user_id = ?";

		try(Connection conn = DatabaseConnection.getConnection()){

		PreparedStatement pstmt = conn.prepareStatement(query); 
		pstmt.setInt(1, userID);
		pstmt.executeUpdate();
		ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				OrderHistory history = new OrderHistory(
						rs.getDate("order_date"),
						rs.getInt("order_id"),
						rs.getBigDecimal("total_amount")
				);
				orderHistories.add(history);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return orderHistories;
	}

	public static class OrderHistory {

		private Date orderDate;
		private int orderId;
		private BigDecimal totalAmount;

		public OrderHistory(Date orderDate, int orderId, BigDecimal totalAmount) {
			this.orderDate = orderDate;
			this.orderId = orderId;
			this.totalAmount = totalAmount;
		}

		// Getters
		public Date getOrderDate() {
			return orderDate;
		}

		public int getOrderId() {
			return orderId;
		}

		public BigDecimal getTotalAmount() {
			return totalAmount;
		}
	}
}
