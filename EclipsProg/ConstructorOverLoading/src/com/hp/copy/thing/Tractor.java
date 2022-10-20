package com.hp.copy.thing;

public class Tractor {
	public String name;
	public String brand;
	public double price;
	public String colour;
	public long horsePower;
	public char model;
	
	public Tractor()
	{
	System.out.println("Calling default values of Tractor constructor");	
	}
	
	public Tractor() {
		this();
		this.name=name;
	}

}
