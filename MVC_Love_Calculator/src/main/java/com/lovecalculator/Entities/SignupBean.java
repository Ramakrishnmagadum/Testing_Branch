package com.lovecalculator.Entities;

import java.util.Arrays;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.lovecalculator.CustomAnnotation.Age;
import com.lovecalculator.CustomAnnotation.Country;

public class SignupBean {

	@NotBlank(message="* Enter Name ")
	@Size(min=2, max=15 ,message="* Your Name should be between 2 to 15 charecters")
	private String name;
	
//	@NotBlank(message = "* Enter Username")
	private String username;
	
	@Size(min=8 , max=12, message="* Password should be between 8 to 15 charecters")
	private char[] password;
	
//	values should not be null and it should start with mentioned letter
	@Country(startwith="I")
	private String country;
	private String[] hobbies;
	private String gender;
	
	//creating Custom Validator as @Age
	//it validate i. value should not be null  ii. entered value should be in between the range
	@Age(lower=21 , higger=50)
	private Integer age;
	
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private CommunicationDTO communicationdto;
	
	public CommunicationDTO getCommunicationdto() {
		return communicationdto;
	}
	public void setCommunicationdto(CommunicationDTO communicationdto) {
		this.communicationdto = communicationdto;
	}
	public String getName() {
		return name;
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
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "SignupBean [name=" + name + ", username=" + username + ", password=" + Arrays.toString(password)
				+ ", country=" + country + ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender
				+ ", communicationdto=" + communicationdto + "]";
	}
}
