/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exshopping.model;

/**
 *
 * @author sanbid
 */

public class CartItem {

	private int cartId;
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private String productImage; // Added product image path

	public CartItem(int cartId, int productId, String productName, double price, int quantity, String productImage) {
		this.cartId = cartId;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productImage = productImage;
	}

	// Getters
	public int getCartId() {
		return cartId;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getProductImage() {
		return productImage;
	}
}
