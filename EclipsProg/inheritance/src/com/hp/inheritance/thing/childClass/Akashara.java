package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.HumanResourse1;

public class Akashara extends HumanResourse1 {
	public String workingAt;
	
	public Akashara(String name, String qualification, String from,String workingAt) {
	  super(name,qualification,from);
	  this.workingAt=workingAt;
	
	}
	
	@Override
	
	public void responsibility() {
		super.responsibility();
		System.out.println("Currentli working at : "+this.workingAt);
		System.out.println("=================================");
	}
	
	public void power() {
		super.power();
		System.out.println("Child class overriden the Parent class power method");
	}

}
