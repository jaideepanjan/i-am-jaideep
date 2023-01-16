package com.xworkz.springInterface.repository;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {

	public Diesel() {
		System.out.println("running the diesel");	}
	@Override
	public void consume() {
		// TODO Auto-generated method stub
		
	}

}
