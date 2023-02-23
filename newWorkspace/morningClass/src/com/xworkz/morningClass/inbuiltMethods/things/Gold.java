package com.xworkz.morningClass.inbuiltMethods.things;

public class Gold {
	
	private float charter;
	private String color;
	private double density;
	private boolean metal;
	
	public Gold() {
		System.out.println("Running no-arg cons in Gold");
	}

	@Override
	public String toString() {
		return "Gold [charter=" + charter + ", color=" + color + ", density=" + density + ", metal=" + metal + "]";
	}

	public float getCharter() {
		return charter;
	}

	public void setCharter(float charter) {
		this.charter = charter;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public boolean isMetal() {
		return metal;
	}

	public void setMetal(boolean metal) {
		this.metal = metal;
	}
	
	

}
