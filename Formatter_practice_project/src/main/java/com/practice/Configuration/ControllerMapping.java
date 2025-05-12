package com.practice.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.practice.formatter.Cardnumberformatter;
import com.practice.formatter.amountformatter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.practice.controller")
public class ControllerMapping  implements WebMvcConfigurer{

	@Bean
	public InternalResourceViewResolver getresolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new Cardnumberformatter());
		registry.addFormatter(new amountformatter());
	}
}
