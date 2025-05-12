package com.feedback.Entities;

public class UserInfoBean {
	String username;
	String Email;
	String Feedback;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	@Override
	public String toString() {
		return "HomeBean [username=" + username + ", Email=" + Email + ", Feedback=" + Feedback + "]";
	}	
}
