package com.xworkz.morningClass.Overriding;

public class Soil {
	
	public Soil() {
		System.out.println("Running no-agg cons in Soil");
	}
	
	public String strength() {
		System.out.println("Strength of the soil changes according to the types");
		return "NotBad";
	}
	
	public String color() {
		System.out.println("The soil has different color");
		return color();
	}
	

}
