package com.xwork.amul.configurations;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AmulWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		Class[] ref = { AmulConfiguration.class };
		return ref;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the method getServletConfigClasses");
		Class[] ref1 = { AmulConfiguration.class };
		return ref1;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running the method getServletMappings");
		String[] ref2 = { "/" };
		return ref2;
	}

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running the configureDefaultServletHandling method ");
		configurer.enable();
	}
}
