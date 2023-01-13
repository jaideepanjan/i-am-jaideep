package com.xworkz.bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bean.thing.Actor;
import com.xworkz.bean.thing.Rocket;
import com.xworkz.bean.thing.Season;


@Configuration
@ComponentScan("com.xworkz.bean")
public class BeanConfiguration {
	
	public BeanConfiguration() {
		System.out.println("Running default constructor Bean Configuration ");
	}
	
	@Bean
	public Actor acting() {
		Actor actor=new Actor();
		return actor;
	}
	
	@Bean
	public Rocket rock() {
		Rocket rocket=new Rocket("ROHINI-75", "India", 75D);
		return rocket;
	}
	
	@Bean
	public Season seasun() {
		Season season=new Season();
		season.setName("Summer");
		season.setStartingMonth("March");
		season.setDuration(3);
		return season;
	}
	
	

}
