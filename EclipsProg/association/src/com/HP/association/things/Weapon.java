package com.HP.association.things;

public class Weapon {
	public String name;
	public String use;
	public double weight;
	
	public Weapon(String name,String use,double weight) {
		super();
		this.name=name;
		this.use=use;
		this.weight=weight;
	}
	public void showoff() {
		System.out.println("Name of the weapon is : " +name);
		System.out.println("Use of the weapon is : " +use);
		System.out.println("Weight of the weapon is : " +weight);
	}

	
}
