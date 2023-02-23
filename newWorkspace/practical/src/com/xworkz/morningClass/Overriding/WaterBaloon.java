package com.xworkz.morningClass.Overriding;

public class WaterBaloon extends Baloon{
	
	public WaterBaloon() {
		System.out.println("Running no-arg cons in WaterBaloon");
	}

	
	@Override
	public String brand() {
		System.out.println("water baloon brand is : ");
		return "Bancho";
	}
	
}
