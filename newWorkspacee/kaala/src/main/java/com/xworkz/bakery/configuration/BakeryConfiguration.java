package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz")
public class BakeryConfiguration {
	
	public BakeryConfiguration() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	
}
