package com.xworkz.forest.configuration;

import org.springframework.beans.propertyeditors.ClassArrayEditor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Webinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	
	public Webinit() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method ");
		return new Class[] {Configuration.class};
	}

	@Override
	protected String[] getServletMappings() {
	System.out.println("Running getServletMappings method");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling method");
		configurer.enable();
	}
	
	

}
