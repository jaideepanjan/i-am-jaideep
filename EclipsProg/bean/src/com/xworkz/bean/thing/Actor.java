package com.xworkz.bean.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	@Value("Anjan Jaideep")
	private String name;
	@Value("Kannada")
	private String language;
	@Value("23")
	private int age;

	public Actor() {
		System.out.println("Running the default constructer of Actor ");
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public int getAge() {
		return age;
	}

}
