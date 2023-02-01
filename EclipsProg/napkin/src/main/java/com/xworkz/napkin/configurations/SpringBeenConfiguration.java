package com.xworkz.napkin.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.napkin")
public class SpringBeenConfiguration {
	
	public SpringBeenConfiguration() {
		System.out.println("Configuraion created "+this.getClass().getSimpleName());
	}

}
