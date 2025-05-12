package com.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebIntializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(ControllerMapping.class);
		
		DispatcherServlet servlet = new DispatcherServlet(webApplicationContext);
		Dynamic mydispatcher = servletContext.addServlet("myURLFromSubmitdispatcherservlet", servlet);
		mydispatcher.addMapping("/");
		mydispatcher.setLoadOnStartup(1);
	}

}
