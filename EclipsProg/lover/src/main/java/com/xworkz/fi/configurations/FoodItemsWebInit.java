package com.xworkz.fi.configurations;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodItemsWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
	public FoodItemsWebInit() {
		System.out.println("Created" +this.getClass().getSimpleName());
		
	}
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses...");
		Class[] ref= {FoodItemsConfiguration.class};
		return ref;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println(" Created getServletConfigClasses" );
		Class[] ref1= {FoodItemsConfiguration.class};
		return ref1;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println(" Created getServletMappings" );
		String[] ref2= {"/"};
		return ref2;
	}

}
