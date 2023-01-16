package com.xworkz.springInterface.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springInterface")
public class FuelConfiguration {

	public FuelConfiguration() {
		System.out.println("Running Fuel config");
	}

}
