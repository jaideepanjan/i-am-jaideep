package com.xworkz.muddu.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EggWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	
	public EggWebInit() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method");
		Class[] ref= {EggConfiguration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		String[] ref2= {"/"};
		return ref2;
	}
	
	 public void configureDefaultServletHandling (DefaultServletHandlerConfigurer configurer) {
		 System.out.println("Running configureDefaultServletHandling");
		 configurer.enable();
	 }

}
