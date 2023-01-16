package com.xworkz.springInterface.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel{
	@Autowired
	private PetrolBunk bunk;
	public Petrol() {
		System.out.println("running petrol");	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		
	}
	
	public void location() {
		bunk.purchase();
	}

}
