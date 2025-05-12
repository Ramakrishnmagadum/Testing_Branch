package com.practice.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.Entities.Card_details;

@Controller
public class Homecontroller {

	@RequestMapping("/")
	public String gethomepage(@ModelAttribute("details") Card_details details) {
		return "Home-page";
	}
	
	@RequestMapping("/resultpage")
	public String getresultpage(@Valid @ModelAttribute("details")Card_details details , BindingResult result) {
		
		if(result.hasErrors()) {
			return "Home-page";
		}
		return "resultpage";
	}
}
