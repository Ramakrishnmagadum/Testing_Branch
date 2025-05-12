package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//to trigger this class first need to mention /shop url  
//after this based on methods we want to excute --pass that url 
@RequestMapping("/shop")
public class ShopController {

	@RequestMapping("/book")
	//	//@ResponseBody By this  we can return String as response..
	@ResponseBody
	public String getBooks() {
		return "Please find your books here";
	}
	//@ResponseBody By this  we can return String as response..
	@ResponseBody
	@RequestMapping("food")
	public String getFood() {
		return "what you want to eat ? please order the food";
	}
}
