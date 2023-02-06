package com.xworkz.enjoy.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running the getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the getServletConfigClasses");
		Class[] ref={SpringConfiguration.class};
		System.out.println("getServletConfigClasses "+Arrays.toString(ref));
		System.out.println();
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
     
		System.out.println("Running the method getServletMappings ");
		String[] ref1= {"/"};
		System.out.println("getServletMappings "+Arrays.toString(ref1));
		return ref1;
	}
	
  
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running the configureDefaultServletHandling method ");
	configurer.enable();
	}
	

}
