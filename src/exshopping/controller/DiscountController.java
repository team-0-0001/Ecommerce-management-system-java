/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exshopping.controller;
import exshopping.model.DatabaseConnection;
import exshopping.model.DiscountCode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanbid
 */

public class DiscountController {

	public static double validateDiscount(String discountCode, double subtotal) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT percentage FROM discount_codes "
					+ "WHERE code = ? AND current_usage < max_usage";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, discountCode);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				double discountPercentage = rs.getDouble("percentage");
				double discountAmount = subtotal * (discountPercentage / 100);

				// Update usage count
				updateDiscountUsage(conn, discountCode);

				return discountAmount;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private static void updateDiscountUsage(Connection conn, String discountCode) throws SQLException {
		String updateQuery = "UPDATE discount_codes SET current_usage = current_usage + 1 WHERE code = ?";
		PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
		updateStmt.setString(1, discountCode);
		updateStmt.executeUpdate();
	}

	public static boolean createDiscountCode(String code, double percentage, int maxUsage) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "INSERT INTO discount_codes (code, percentage, max_usage, current_usage) VALUES (?, ?, ?, 0)";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, code);
			pstmt.setDouble(2, percentage);
			pstmt.setInt(3, maxUsage);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean updateDiscountCode(String code, double percentage, int maxUsage) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "UPDATE discount_codes SET percentage = ?, max_usage = ? WHERE code = ?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setDouble(1, percentage);
			pstmt.setInt(2, maxUsage);
			pstmt.setString(3, code);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean deleteDiscountCode(String code) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "DELETE FROM discount_codes WHERE code = ?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, code);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static List<DiscountCode> getAllDiscountCodes() {
		List<DiscountCode> discountCodes = new ArrayList<>();
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT code, percentage, max_usage, current_usage FROM discount_codes";

			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				DiscountCode discountCode = new DiscountCode(
						rs.getString("code"),
						rs.getDouble("percentage"),
						rs.getInt("max_usage"),
						rs.getInt("current_usage")
				);
				discountCodes.add(discountCode);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return discountCodes;
	}
}

// Corresponding DiscountCode model class