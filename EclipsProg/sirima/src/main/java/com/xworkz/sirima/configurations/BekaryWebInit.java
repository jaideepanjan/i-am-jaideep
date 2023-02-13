package com.xworkz.sirima.configurations;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BekaryWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method");
		
		Class[] ref= {BekariConfiguration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings method");
		String[] ref2= {"/"};
		return ref2;
	}
	
	 public void configureDefaultServletHandling (DefaultServletHandlerConfigurer configurer) {
		 System.out.println("Running configureDefaultServletHandling");
		 configurer.enable();
	 }

}
