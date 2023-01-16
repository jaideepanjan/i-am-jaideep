package com.xworkz.interface_spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.interface_spring.Browser;
import com.xworkz.interface_spring.Provider;
@Component
public class Chrome implements Browser {
	
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	
	public Chrome() {
		System.out.println("Created chrome");
	}

	

	@Override
	public void browser() {
		provider.connect();
		System.out.println("implemented browser in chrome");
		
	}

}
