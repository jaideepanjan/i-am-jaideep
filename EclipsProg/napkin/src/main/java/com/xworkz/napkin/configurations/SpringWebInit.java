package com.xworkz.napkin.configurations;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	
	public SpringWebInit() {
		System.out.println("Running SpringWebInit...");
	}
	
	

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running the get root config classes...");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the getServletConfigClasses...");
		Class[] ref= {SpringBeenConfiguration.class};
		System.out.println("getServletConfigClasses"+Arrays.toString(ref));
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings..");
		String[] str={"/"};
		System.out.println("getServletMappings "+Arrays.toString(str));
		return str;
		
		
	}
	@Override
		public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
		}

	

}
