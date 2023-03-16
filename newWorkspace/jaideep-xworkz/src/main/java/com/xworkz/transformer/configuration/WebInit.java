package com.xworkz.transformer.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	
	public WebInit() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method");
		return new Class[] {TransformerConfiguration.class};
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
	
//	 @Override
//	    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//
//	        String tempDir="D:\\tatkalika";
//	        int maxUploadSizeInMb=3 * 1024 * 1024;
//	        File uploadDirectory = new File("tempDir");
//
//	        // register a MultipartConfigElement
//	        MultipartConfigElement multipartConfigElement =
//	                new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
//	                        maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);
//
//	        registration.setMultipartConfig(multipartConfigElement);
//
//	        super.customizeRegistration(registration);
//	    }
	
	

}
