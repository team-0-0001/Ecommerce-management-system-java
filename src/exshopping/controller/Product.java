/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exshopping.controller;

/**
 *
 * @author sanbid
 */
public class Product {
	private int productId;
	private String productName;
	private double price;
	private String description;
	private String imagePath;
	private double stockQuantity;
	private String category;

	public Product(int productId, String productName, double price, String description,
			String imagePath, double stockQuantity, String category ) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.imagePath = imagePath;
		this.stockQuantity = stockQuantity;
		this.category = category;
	}

	// Getters
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String getImagePath() {
		return imagePath;
	}


	public double getStockQuantity() {
		return stockQuantity;
	}

	public String getCategory() {
		return category;
	}
}
