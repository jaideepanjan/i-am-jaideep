package com.xworkz.aeroplane.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AeroplaneWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public AeroplaneWebInit() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method");
		return new Class[] {AeroplaneConfiguration.class} ;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings method ");
		return new String[] {"/"};	
		}
	
	
	@Override	
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running ");
		configurer.enable();
	}
	
	
	
	

	
	

}
