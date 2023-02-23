package com.xworkz.morningClass.Overriding;

public class Baloon {
	
	public Baloon() {
		System.out.println("Running no-arg cons in baloon ");
	}
	
	public  String brand() {
		System.out.println("Baloon has different brands");
		return brand();
	}
	
	public int size() {
		System.out.println("Baloon size diffeent based on the thickness");
		return 12;
	}

}
