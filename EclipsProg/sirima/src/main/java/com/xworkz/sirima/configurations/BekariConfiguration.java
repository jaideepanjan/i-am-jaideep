package com.xworkz.sirima.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.sirima")
public class BekariConfiguration {
	
	public BekariConfiguration() {
		System.out.println("Created" +this.getClass().getSimpleName());		
	}
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver("/",".jsp");	
		
		return viewResolver();
		
	
	}

}
