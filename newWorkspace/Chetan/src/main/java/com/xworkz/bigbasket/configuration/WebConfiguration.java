package com.xworkz.bigbasket.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bigbasket")
public class WebConfiguration {
	
	public WebConfiguration() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}

//	@Bean
//	public ViewResolver viewResolver() {
//
//		System.out.println("this viewResolver");
//
//		return new InternalResourceViewResolver("/", ".jsp");
//	}

//	@Bean
//	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
//		System.out.println("this is localContainerEntityManagerFactoryBean");
//		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//		return bean;
//	}

}
