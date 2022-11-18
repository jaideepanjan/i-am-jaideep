package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.Satellite;

public class Moon extends Satellite {
	public double radius;
	
	public Moon() {
		
	}
	public Moon(String name, double age, double gravity,double radius) {
		super(name,age,gravity);
		this.radius=radius;		
	}
	
	public void baChandra() {
		super.baChandra();
		System.out.println("Sattalite radius is "+this.radius);
	}
	

}
