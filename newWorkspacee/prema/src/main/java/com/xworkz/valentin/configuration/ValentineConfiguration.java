package com.xworkz.valentin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.valentin")
public class ValentineConfiguration {
	
	public ValentineConfiguration() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Registering custom view resolver...");
		return new InternalResourceViewResolver("/",".jsp");
	}

}
