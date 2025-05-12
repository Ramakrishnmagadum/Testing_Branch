package com.feedback.Config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.feedback.Service.FeedbackEmailSenderImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.feedback.controller" , "com.feedback.Service"})
public class ControllerMapping {
	
	
	@Bean 
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
		viewresolver.setPrefix("/WEB-INF/view/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
	}
	
	@Bean
	public JavaMailSenderImpl getjavamailsender() {
		JavaMailSenderImpl mailsender = new JavaMailSenderImpl();
//		--------------------------------------------------------------------------------------------------
//			---- This Properties for JavaMailSender ----- 
			mailsender.setHost("smtp.gmail.com");
			mailsender.setUsername("ramakrishnmagadum@gmail.com");
			// fbul rrmy vdnp qdtw  --this is only generated password..
			mailsender.setPassword("fbul rrmy vdnp qdtw");
			mailsender.setPort(587);



			Properties emailproperties = new Properties();
			emailproperties.put("mail.smtp.starttls.enable", true);
			emailproperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

			mailsender.setJavaMailProperties(emailproperties);
			return mailsender;
	}

}
