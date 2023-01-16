package com.xworkz.interface_spring.bean;

import org.springframework.stereotype.Component;

import com.xworkz.interface_spring.Provider;
@Component
public class Airtel implements Provider {
	
	public Airtel() {
		System.out.println("created Airtel no-argument constructer ");
		}
	
	

	@Override
	public void connect() {
		System.out.println("implemented provider in Airtel");

	}

}
