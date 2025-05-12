package com.Exception.Controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {

//	This Request Throwing the NullPointerException
	@RequestMapping("/home3")
	public String getHomepage() {
		if (true) {
			throw new NullPointerException();
		}
		return "Home-Page";
	}
	
	
	@RequestMapping("/home4")
	public String getHomepage2() throws IOException {
		if (true) {
			throw new IOException();
		}
		return "Home-Page";
	}
}
