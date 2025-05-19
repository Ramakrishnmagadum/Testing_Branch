package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CricketBatController {

public void GetError(){
return "error";
}

	//@ResponseBody By this  we can return String as response..
	@ResponseBody
	@RequestMapping("/bat")
	public String getbat() {
                String name;
                if(name =="ram")
		return "take here is your bat";
	}

    
}
