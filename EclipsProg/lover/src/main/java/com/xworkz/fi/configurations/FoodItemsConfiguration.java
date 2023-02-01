package com.xworkz.fi.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.fi")
public class FoodItemsConfiguration {
	
	public FoodItemsConfiguration() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}

}
