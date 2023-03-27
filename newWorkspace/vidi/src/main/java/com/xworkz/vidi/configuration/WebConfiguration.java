package com.xworkz.vidi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.xworkz.vidi")
public class WebConfiguration {
	
	public WebConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	
	@Bean
	public ViewResolver viewResolver() {

		System.out.println("Running ViewResolver method");
		return new InternalResourceViewResolver("/", ".jsp");

	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Running LocalContainerEntityManagerFactoryBean method");
		LocalContainerEntityManagerFactoryBean been = new LocalContainerEntityManagerFactoryBean();
		return been;

	}

}
