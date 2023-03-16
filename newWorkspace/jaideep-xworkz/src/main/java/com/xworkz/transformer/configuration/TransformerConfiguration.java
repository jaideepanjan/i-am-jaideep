package com.xworkz.transformer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.transformer")
public class TransformerConfiguration {

	public TransformerConfiguration() {
		System.out.println("Created" + this.getClass().getSimpleName());
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

//	@Bean
//	public MultipartResolver multipartResolver() {
//		System.out.println("Registering MultipartResolver");
//		return new StandardServletMultipartResolver();
//	}
//	

}
