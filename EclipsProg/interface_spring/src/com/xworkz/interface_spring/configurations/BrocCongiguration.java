package com.xworkz.interface_spring.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BrocCongiguration {
	
	public BrocCongiguration() {
		System.out.println("Created Broc Configuration");
	}

}
