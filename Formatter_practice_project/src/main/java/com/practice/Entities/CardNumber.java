package com.practice.Entities;

public class CardNumber {

	private String firstfourdigit;
	private String secondfourdigit;
	private String thirdfourdigit;
	private String fourthfourdigit;

	public String getFirstfourdigit() {
		return firstfourdigit;
	}

	public void setFirstfourdigit(String firstfourdigit) {
		this.firstfourdigit = firstfourdigit;
	}

	public String getSecondfourdigit() {
		return secondfourdigit;
	}

	public void setSecondfourdigit(String secondfourdigit) {
		this.secondfourdigit = secondfourdigit;
	}

	public String getThirdfourdigit() {
		return thirdfourdigit;
	}

	public void setThirdfourdigit(String thirdfourdigit) {
		this.thirdfourdigit = thirdfourdigit;
	}

	public String getFourthfourdigit() {
		return fourthfourdigit;
	}

	public void setFourthfourdigit(String fourthfourdigit) {
		this.fourthfourdigit = fourthfourdigit;
	}

	@Override
	public String toString() {
		return firstfourdigit + "-" + secondfourdigit + "-" + thirdfourdigit + "-" + fourthfourdigit;
	}

}
