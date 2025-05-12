package com.lovecalculator.Entities;

public class Phone {
	
	private String countrycode;
	private String phonenumber;
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return countrycode+"-"+ phonenumber;
	}
}
