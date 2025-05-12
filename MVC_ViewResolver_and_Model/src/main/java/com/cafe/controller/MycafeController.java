package com.cafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MycafeController {
	
	@RequestMapping("/cafe")
	public String getmycafe() {
//		like this also we can pass But InternalResourceViewResolver --will make preetty easy we can give suffix and prefix thier and only .jsp file name will pass
//		return "/WEB-INF/view/welcome-page.jsp";
		return "Welcome-page";
	}
	
	@RequestMapping("/ordercontroller")
	//request --user enterd data stored in this , and we can get inout and store in model 
	//Model --this contains application data , user enterd data we can set into model and pass to other view pages....
	public String getorder(HttpServletRequest request ,Model model) {
		String name=request.getParameter("name");
		String food=request.getParameter("food");
		//this model hold the user enrterd data and pass this data to the .Jsp Page .......
		model.addAttribute("name", name);
		model.addAttribute("food", food);
		return "order-page";
	}

}
