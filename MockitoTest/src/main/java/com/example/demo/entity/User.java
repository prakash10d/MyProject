package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userId;
	String userName;
	String userPassword;
	
	public User(int userId, String userName, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	@OneToOne(cascade = CascadeType.ALL)
	private UserDetails userDetails;
	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
