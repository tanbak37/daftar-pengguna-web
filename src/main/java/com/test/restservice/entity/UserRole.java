package com.test.restservice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.access.event.PublicInvocationEvent;


@Entity
public class UserRole {

	@Id
	private String username;
	private String role;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "UserRole{" + "username='" + username + '\'' + ", role='" + role + '\''  + '}';
	}
	
}
