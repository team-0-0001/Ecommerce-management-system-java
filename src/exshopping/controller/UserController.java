/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exshopping.controller;

/**
 *
 * @author sanbid
 */



import exshopping.model.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserController {
	// Create a new user (Admin Only)

	public static boolean createUser(String name, String username, String password, String role) {
		String hashedPassword = hashPassword(password);

		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "INSERT INTO users (name, username, password, role) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, hashedPassword);
			pstmt.setString(4, role);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	// Retrieve all users
		public static List<Object[]> getAllUsers() {
		List<Object[]> users = new ArrayList<>();
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT id, name, username, password, created_at, role FROM users";
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Object[] user = {
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("username"),
					rs.getString("password"),
					rs.getTimestamp("created_at"),
					rs.getString("role")
				};
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		};
		return users;
	}

		// Update user details
	public static boolean updateUser(int userId, String name, String username, String role,String password) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "UPDATE users SET name = ?, username = ?, role = ?, password = ? WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, role);
			pstmt.setString(4, password);
			pstmt.setInt(5, userId);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	// Delete a user (Admin Only)
	public static boolean deleteUser(int userId) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "DELETE FROM users WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, userId);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	// Get a user by ID
	public static Object[] getUserById(int userId) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT * FROM users WHERE id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				return new Object[]{
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("username"),
					rs.getString("password"),
					rs.getString("role")
				};
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new Object[]{};
	};

	// Simple password hashing (Note: Use a more secure method in production)
	private static String hashPassword(String password) {
		return String.valueOf(password.hashCode());
	}


}
