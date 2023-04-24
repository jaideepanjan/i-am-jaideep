package com.xworkz.project.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProjectWebIniti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
	public ProjectWebIniti() {
		log.info("Created"+this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses");
		return new Class[] {ProjectConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses");
		return new Class[] {ProjectConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		log.info("Running configureDefaultServletHandling");
		configurer.enable();
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		String tempDir = "D:\\temp";
		int maxUploadSizeInMb = 20 * 1024 * 1024;
		File uploadDirectory = new File(tempDir); // path used by server
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);

		registration.setMultipartConfig(multipartConfigElement);

	}
	
	
	
	
	
}
