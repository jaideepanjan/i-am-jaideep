package com.xworkz.data.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.data")
public class PersonConfiguration {
	
	public PersonConfiguration() {
		System.out.println("Running no-arg constructer in configuration");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Running localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean been=new LocalContainerEntityManagerFactoryBean();
		return been;
	}
}
