package com.xworkz.morningClass.Overriding;

public class SiltSoil extends Soil {
	
	
	public SiltSoil() {
		System.out.println("Running no-arg cons in SiltSoil ");
	}
	
    @Override
	public String strength() {
		
		System.out.println("Strength of the Siltsoil is : ");
		return "Good";
	}
	
}
