/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exshopping.model;

/**
 *
 * @author sanbid
 */


public class User {

	private String name;
	private String username;
	private String password;
	private String role;

	public User(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
