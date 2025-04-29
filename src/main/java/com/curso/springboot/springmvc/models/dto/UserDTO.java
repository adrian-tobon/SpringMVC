package com.curso.springboot.springmvc.models.dto;

import com.curso.springboot.springmvc.models.User;

public class UserDTO {
	
	private String title;
	private User user;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
