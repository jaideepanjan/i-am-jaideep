package com.hp.inheritance.thing.childClass;

public class Rafell {
	public String nickName;
	
	public Refell(int members, String type, boolean duplex) {
		super(members,type,duplex);
		this.nickName=nickName;
	}
	@Override
	public void fly() {
		super.fly();
		System.out.println("Nick name of the jet : "+nickName);
	    System.out.println("---------------------------------");
	} 
	public void fight() {
		super.fight();
		System.out.println("Child class overriden the Parent class fight method");
	}

}
