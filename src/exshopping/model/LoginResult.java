/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exshopping.model;

/**
 *
 * @author sanbid
 */

public class LoginResult {

	private final boolean success;
	private final String role;

	public LoginResult(boolean success, String role) {
		this.success = success;
		this.role = role;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getRole() {
		return role;
	}
}
