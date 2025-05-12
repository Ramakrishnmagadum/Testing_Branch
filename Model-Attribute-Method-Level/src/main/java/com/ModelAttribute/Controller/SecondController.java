package com.ModelAttribute.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ModelAttribute.DTO.MYwebsiteIntoDTO;

@Controller
public class SecondController {	
//	In this Method -->@ModelAttribute("websiteinfo") --> with this Name Global Model was created in this MywebsiteController By Decalring @ControllerAdvice Annotation on top the this controller... 
	@RequestMapping("/second")
	public String showWebsiteInfo(@ModelAttribute("websiteinfo") MYwebsiteIntoDTO websiteinfo) {
		System.out.println("Inside showWebsiteInfo Method");
		System.out.println(websiteinfo.getWebsiteName());
		System.out.println(websiteinfo.getWebsiteCategory());
		return "Home-Page";
	}
	
}
