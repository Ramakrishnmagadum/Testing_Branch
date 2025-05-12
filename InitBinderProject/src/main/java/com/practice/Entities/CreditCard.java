package com.practice.Entities;

public class CreditCard {
	private Integer firstfourdigit;
	private Integer secondfourdigit;
	private Integer thirdfourdigit;
	private Integer fourthfourdigit;

	public Integer getFirstfourdigit() {
		return firstfourdigit;
	}

	public void setFirstfourdigit(Integer firstfourdigit) {
		this.firstfourdigit = firstfourdigit;
	}

	public Integer getSecondfourdigit() {
		return secondfourdigit;
	}

	public void setSecondfourdigit(Integer secondfourdigit) {
		this.secondfourdigit = secondfourdigit;
	}

	public Integer getThirdfourdigit() {
		return thirdfourdigit;
	}

	public void setThirdfourdigit(Integer thirdfourdigit) {
		this.thirdfourdigit = thirdfourdigit;
	}

	public Integer getFourthfourdigit() {
		return fourthfourdigit;
	}

	public void setFourthfourdigit(Integer fourthfourdigit) {
		this.fourthfourdigit = fourthfourdigit;
	}

	@Override
	public String toString() {
		return firstfourdigit + "-" + secondfourdigit + "-" + thirdfourdigit + "-" + fourthfourdigit;
	}

}
