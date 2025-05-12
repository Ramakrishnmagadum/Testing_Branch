package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SugerContoller {

	//@ResponseBody By this  we can return String as response..
	@ResponseBody
	@RequestMapping("/suger")
	public String getsuger() {
		return "please give some suger";
	}
}
