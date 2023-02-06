package com.xworkz.enjoy.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.enjoy")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Created "+toString().getClass().getSimpleName());
		
	}
	

}
