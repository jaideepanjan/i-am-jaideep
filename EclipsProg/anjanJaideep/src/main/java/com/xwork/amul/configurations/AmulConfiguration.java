package com.xwork.amul.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xwork.amul")
public class AmulConfiguration {
	
	public AmulConfiguration() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}

}
