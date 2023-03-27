package com.xworkz.morningClass.Overriding;

public class Tubelight {
	private String colour;
	
	public Tubelight() {
		System.out.println("Running no-arg cons in Tubelight");
	}

	
	public char size() {
		System.out.println("Size of the tubeligtht is depends on requirement");
		return size();
	}
	
	public String colour() {
		System.out.println("Tubelight Has different colours");
		return "Blue";
	}
}
