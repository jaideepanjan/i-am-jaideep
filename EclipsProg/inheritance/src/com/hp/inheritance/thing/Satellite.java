package com.hp.inheritance.thing;

public class Satellite {
	public String name;
	public double age;
	public double gravity;
	
	public Satellite() {
		
	}

	public Satellite(String name, double age, double gravity) {
		this.name = name;
		this.age = age;
		this.gravity = gravity;
	}
	
	public void baChandra() {
		System.out.println("Name of the satellite : "+name);
		System.out.println("Age of the satellite : "+age +"billion years");
		System.out.println("Gravity of the satellite : "+gravity +"m/s squares");
	}

}
