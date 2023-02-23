package com.xworkz.morningClass.inbuiltMethods.things;

public class Sugercane {
	
	private double height;
	private String from;
	private String colour;
	private int age;
	
	public Sugercane() {
		System.out.println("Running no agr constructer in SugerCane");
	}

	@Override
	public String toString() {
		return "Sugercane [height=" + height + ", from=" + from + ", colour=" + colour + ", age=" + age + "]";
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
