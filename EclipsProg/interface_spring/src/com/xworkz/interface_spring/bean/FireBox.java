package com.xworkz.interface_spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.interface_spring.Browser;
import com.xworkz.interface_spring.Provider;

@Component
public class FireBox implements Browser {

	@Autowired
	@Qualifier("jio")
	private Provider provider;
	
	
	public FireBox() {
		System.out.println("created no-argument constructer of FireBox");
	}

	@Override
	public void browser() {
		provider.connect();
		System.out.println("implemented browse in fire box");
		
	}
}
