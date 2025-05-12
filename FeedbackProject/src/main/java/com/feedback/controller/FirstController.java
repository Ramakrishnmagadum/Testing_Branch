package com.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feedback.Entities.UserInfoBean;
import com.feedback.Service.FeedbackEmailSenderImpl;

@Controller
public class FirstController {
	@Autowired
	FeedbackEmailSenderImpl mail;
	
	@RequestMapping("/")
	public String getHomepage(@ModelAttribute("userinfo") UserInfoBean user) {
		return "Home-page";
	}
	
	@RequestMapping("/sendEmail")
	public String SendEmail(@ModelAttribute("userinfo") UserInfoBean user) {
		mail.sendEmail(user.getUsername(), user.getEmail(), user.getFeedback());
		return "Processed-page";
	}

}
