package com.lovecalculator.Entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoBean {
	
	public UserInfoBean() {
		super();
	}
	public UserInfoBean(String username, String crushname, boolean condition) {
		super();
		this.username = username;
		this.crushname = crushname;
		this.condition = condition;
	}
	//this is default we are setting 
	//this are non static varible so whenever the object will create then this copy will; be present in the heap memory...
	@NotBlank(message="* Enter UserName ")
	@Size(min=2, max=15 ,message="* Your Name should be between 2 to 15 charecters")
	String username ;//="Default Name";
	
	@NotBlank(message="* Enter CrushName ")
	@Size(min=2, max=15 ,message="* Your CrushName should be between 2 to 15 charecters")
	String crushname; //="Default Crush Name";
	
	@AssertTrue(message="* Agree this is for fun") //this should be true else it will throw the errorsss....
	boolean condition;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	public boolean isCondition() {
		return condition;
	}
	public void setCondition(boolean condition) {
		this.condition = condition;
	}
}
