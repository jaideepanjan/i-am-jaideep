package com.xworkz.morningClass.inbuiltMethods.things;

public class Door {
	
	private String brand;
	private int quality;
	private double length;
	private double breath;
	
	public Door() {
	      System.out.println("Running no arg cons in Door");
	}

	@Override
	public String toString() {
		return "Door [brand=" + brand + ", quality=" + quality + ", length=" + length + ", breath=" + breath + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}
	
	

}
