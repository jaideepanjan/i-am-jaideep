package com.xworkz.oops.things;

public class Aeroplane extends Vehical {
	
	
	private String name;
	private int id;
	
	public Aeroplane() {
		System.out.println("Running no-arg cons in Aeroplane");
	}
	
	@Override
	public void moveOn() {
		System.out.println("Aeroplane flyes in skay");
		
	}

	public String countryName(String name) {
		System.out.println("the country name of the flight");
		return name;
	}
	
	
	
	

}
