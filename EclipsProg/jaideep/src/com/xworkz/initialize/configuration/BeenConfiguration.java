package com.xworkz.initialize.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeenConfiguration {
	
	
	@Bean
	public String nameOfNewsPaper() {
		return "The Times of India";
	}

	@Bean
	public String newsPaperOwnerName() {
		return "Jaideep";
	}
	
	@Bean
	public String snakeName() {
		return "Python";
	}
	
	@Bean
	public String snakeType() {
		return "Wild";
	}
	
	@Bean
	public boolean isPoisionousSnake() {
		return true;
	}
	
	@Bean
	public String engineName() {
		return "Bike";
	}
	
	@Bean
	public String engineType() {
		return "Petrol";
	}
	
	@Bean
	public String companyOfEngine() {
		return "Hero Honda";
	}
	
	@Bean
	public LocalDate gostDateOfBirth() {
		return LocalDate.of(1995, 05, 10);
	}
	
	@Bean
	public LocalDate gostDateOfDeath() {
		return LocalDate.of(2022, 07, 20);
	}
	
	@Bean
	public boolean isGostHadChildrens() {
		return true;
	}
	
	@Bean
	public String gostFevFood() {
		return "Masal Dose";
	}
	
	@Bean
	public String gostFevPerson() {
		return "Husband";
	}
	
	@Bean
	public String gostFrom() {
		return "Kollegala";
	}
	
	@Bean
	public boolean isGostHaveLegs() {
		return false;
	}
	
	@Bean
	public long gostMobileNo() {
		return 9856321475L;
	}
	@Bean
	public String gostReasionToDie() {
		return "Health ishu";
	}
	@Bean
	public boolean isSatisfied() {
		return false;
	}
	
}
