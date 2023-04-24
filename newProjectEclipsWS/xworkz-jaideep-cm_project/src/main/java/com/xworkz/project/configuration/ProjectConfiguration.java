package com.xworkz.project.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.project")
@Slf4j
public class ProjectConfiguration {

	public ProjectConfiguration() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		log.info("running viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {

		log.info("Running localContainerEntityManagerFactoryBean ");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();

		bean.setPackagesToScan("com.xworkz.project.entity");
		bean.setDataSource(dataSource());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

		return bean;

	}

	public DataSource dataSource() {

		log.info("Running dataSource");

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setPassword("jaideep@sql11");
		dataSource.setUsername("root");

		return dataSource;

	}

	@Bean
	public PasswordEncoder encoder() {

		log.info("Running PasswordEncoder");
		return new BCryptPasswordEncoder();
	}

}
