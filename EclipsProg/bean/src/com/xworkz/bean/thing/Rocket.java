package com.xworkz.bean.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	private String name;
	private String country;
	private Double budget;
	public Rocket(@Value("PSLV rocket")String name, @Value("India") String country,@Value("860 D") Double budget) {
		
		this.name = name;
		this.country = country;
		this.budget = budget;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public Double getBudget() {
		return budget;
	}
	
	

}
