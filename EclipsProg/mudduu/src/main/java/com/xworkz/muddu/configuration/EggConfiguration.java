package com.xworkz.muddu.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.xworkz.muddu")
public class EggConfiguration {
	
	public EggConfiguration() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver("/",".jsp");
		return internalResourceViewResolver;
	}
	
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
	{
		System.out.println("Registering localContainerEntityManagerFactoryBean");
		
		LocalContainerEntityManagerFactoryBean been=new LocalContainerEntityManagerFactoryBean();
		return been;
	}	
	

}
