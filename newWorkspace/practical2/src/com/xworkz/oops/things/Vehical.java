package com.xworkz.oops.things;

public class Vehical {

	private String type;
	private String name;
	private int noOfWeels;

	public Vehical() {
		System.out.println("Running no-arg constructer in vehical");
	}

	public void moveOn() {
		System.out.println("Vehical moves from one side to another side");
		
	}
	
	public void detail(String type, int noOfWeels) {
		this.type = type;
		this.noOfWeels = noOfWeels;
	}

	public void detail(String model, String name, int noOfWeels) {
		this.type = type;
		this.name = name;
		this.noOfWeels = noOfWeels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfWeels() {
		return noOfWeels;
	}

	public void setNoOfWeels(int noOfWeels) {
		this.noOfWeels = noOfWeels;
	}

}
