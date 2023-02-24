package com.xworkz.forest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.forest")
public class WebConfiguration {

	public WebConfiguration() {
		System.out.println("Create" + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Running  viewResolver method");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Runnnig LocalContainerEntityManagerFactoryBean methd");

		LocalContainerEntityManagerFactoryBean been = localContainerEntityManagerFactoryBean();

		return been;
	}

}
