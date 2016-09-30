package com.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class LoginCredentials {
	
	private String username;
	private String password;
	private String role;
	private String name;
	private Timestamp lastLogin;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin( Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	

}
