/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exshopping.model;

/**
 *
 * @author sanbid
 */

public class DiscountCode {

	private String code;
	private double percentage;
	private int maxUsage;
	private int currentUsage;

	public DiscountCode(String code, double percentage, int maxUsage, int currentUsage) {
		this.code = code;
		this.percentage = percentage;
		this.maxUsage = maxUsage;
		this.currentUsage = currentUsage;
	}

	// Getters
	public String getCode() {
		return code;
	}

	public double getPercentage() {
		return percentage;
	}

	public int getMaxUsage() {
		return maxUsage;
	}

	public int getCurrentUsage() {
		return currentUsage;
	}
}
