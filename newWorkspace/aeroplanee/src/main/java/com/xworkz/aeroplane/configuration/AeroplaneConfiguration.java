package com.xworkz.aeroplane.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.aeroplane")
public class AeroplaneConfiguration {
	
	public AeroplaneConfiguration() {
		System.out.println("Running no-arg constructer in AeroplaneConfiguration ");
	}
	@Bean
public ViewResolver viewResolver() {
	System.out.println("this is view resolver");
	return new InternalResourceViewResolver("/",".jsp");
}
	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("this is LocalContainerEntityManagerFactoryBean;");
		LocalContainerEntityManagerFactoryBean bean =new LocalContainerEntityManagerFactoryBean();
		return bean;
	}

}
