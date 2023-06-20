package com.ashok.it.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private Integer userId;
	private String userName;
	private Integer userPhno;
	private Integer userAge;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(Integer userPhno) {
		this.userPhno = userPhno;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhno=" + userPhno + ", userAge=" + userAge
				+ "]";
	}
	
	
}
