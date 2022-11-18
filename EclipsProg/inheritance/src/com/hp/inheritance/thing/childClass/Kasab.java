package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.Terrorist;

public class Kasab extends Terrorist {
	public String colour;
	
	public Kasab(String name, String intension, String country,String colour) {
		super(name,intension,country);
		this.colour=colour;
	} 
@Override
	
	public void fullName() {
		super.fullName();
		System.out.println("Kasab colour : "+this.colour);
		System.out.println("=================================");
	}
	
	public void nickName() {
		super.nickName();
		System.out.println("Child class overriden the Parent class nickName method");
	}

}
