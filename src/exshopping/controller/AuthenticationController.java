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
import exshopping.model.LoginResult;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AuthenticationController {
 private static int currentUserId = 1;


 public static int getUserId(){
	 return currentUserId;
 };

	// User Registration Method

	public static boolean registerUser(String name, String username, String password) {
		// Password Hashing (basic example - use a more secure method in production)
		String hashedPassword = hashPassword(password);

		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "INSERT INTO users (name, username, password) VALUES (?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, hashedPassword);

			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	// Simple password hashing (Note: Use a more secure method in production)
	public static String hashPassword(String password) {
		return String.valueOf(password.hashCode());
	}

	// Login Method
	public static LoginResult loginUser(String username, String password) {
		String hashedPassword = hashPassword(password);
		System.out.println(hashedPassword);
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT id, name, role FROM users WHERE username = ? AND password = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, hashedPassword);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				currentUserId = rs.getInt("id");
				String userRole = rs.getString("role");

				return new LoginResult(true, userRole);
			} else {
				return new LoginResult(false, null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return new LoginResult(false, null);
		}
	}
}
