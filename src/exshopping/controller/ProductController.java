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
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductController {

	private static final String UPLOAD_DIR = "product_images/";
	private static final String DEFAULT_IMAGE = "default_product.png";

	public static void addProduct(String productName, double price, String description, double stock_quantity, String category, File imageFile) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			// Prepare image path
			String imagePath = processImage(imageFile);

			// Insert product
			String query = "INSERT INTO products (product_name, price, description, image_path, stock_quantity, category) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, productName);
			pstmt.setDouble(2, price);
			pstmt.setString(3, description);
			pstmt.setString(4, imagePath);
			pstmt.setDouble(5, stock_quantity);
			pstmt.setString(6, category);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				JOptionPane.showMessageDialog(null, "Product Added Successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error Adding Product: " + e.getMessage());
		}
	}

	public static Object[] getProductById(int productId) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT * FROM products WHERE product_id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, productId);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				return new Object[]{
					rs.getInt("product_id"),
					rs.getString("product_name"),
					rs.getDouble("price"),
					rs.getString("description"),
					rs.getString("image_path"),
					rs.getDouble("stock_quantity"),
					rs.getString("category")
				};
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String processImage(File imageFile) {
		// Create upload directory if not exists
		File baseDir = new File(".");
		File uploadDir = new File(baseDir.getAbsolutePath() + "/src/exshopping/product_images/");
		if (!uploadDir.exists()) {
			uploadDir.mkdirs();
		}

		// Use default image if no image provided
		if (imageFile == null) {
			return "demo.png";
		}

		try {
			// Generate unique filename
			String uniqueFileName = System.currentTimeMillis() + "_" + imageFile.getName();
			Path targetPath = Paths.get(uploadDir + uniqueFileName);

			// Copy file to upload directory
			Files.copy(imageFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);

			return uniqueFileName;
		} catch (IOException e) {
			e.printStackTrace();
			return DEFAULT_IMAGE;
		}
	}

	public static void updateProduct(int productId, String productName, double price, String description, File imageFile) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String imagePath = processImage(imageFile);

			String query = "UPDATE products SET product_name=?, price=?, description=?, image_path=? WHERE product_id=?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, productName);
			pstmt.setDouble(2, price);
			pstmt.setString(3, description);
			pstmt.setString(4, imagePath);
			pstmt.setInt(5, productId);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				JOptionPane.showMessageDialog(null, "Product Updated Successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error Updating Product: " + e.getMessage());
		}
	}

	public static void removeProduct(int productId) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "DELETE FROM products WHERE product_id=?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, productId);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				JOptionPane.showMessageDialog(null, "Product Removed Successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error Removing Product: " + e.getMessage());
		}
	}

	public static List<Product> fetchAllProducts() {
		List<Product> products = new ArrayList<>();

		try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM products")) {

			while (rs.next()) {
				Product product = new Product(
						rs.getInt("product_id"),
						rs.getString("product_name"),
						rs.getDouble("price"),
						rs.getString("description"),
						rs.getString("image_path"),
						rs.getDouble("stock_quantity"),
						rs.getString("category")
				);
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error Fetching Products: " + e.getMessage());
		}

		return products;
	}
}
