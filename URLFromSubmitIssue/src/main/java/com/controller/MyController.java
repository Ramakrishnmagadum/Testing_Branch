package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//for this Controller URL Is  ----> http://localhost:8080/URLFromSubmitIssue/mvc/app/
@RequestMapping("/mvc/app")
public class MyController {
	
	@RequestMapping("/")
	public String ShowIndexPage() {
		return "index";
	}
	
	@RequestMapping("/showHelloWorld")
	public String ShowHelloWorldPage() {
		return "ShowHelloWorld";
	}	

}
