package com.hp.ecception.followers;

public abstract class Person {
	
	public String name;
	public double height;
	public char gender;
	public String colour;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	

	public void eat() {
		System.out.println("Running eat method");
	}
	public void Sleep() {
		System.out.println("Running sleep method");
	}
}
