package com.xworkz.interface_spring.bean;

import org.springframework.stereotype.Component;

import com.xworkz.interface_spring.Provider;

@Component
public class Jio implements Provider {
	
	public Jio() {
		System.out.println("created no-argument constructer of Jio");
	}

	@Override
	public void connect() {
		System.out.println("implemented provider in Jio");

	}

}
