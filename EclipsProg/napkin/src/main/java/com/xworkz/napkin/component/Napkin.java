package com.xworkz.napkin.component;

import org.springframework.stereotype.Component;

@Component
public class Napkin {
	
	public Napkin() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

}
