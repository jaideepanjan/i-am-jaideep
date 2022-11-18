package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.ShopingMall;

public class Orion extends ShopingMall {
	public String devloper;
	
	public Orion() {
		} 
	
	
	public Orion(String name, int flowers, String location,String devloper) {
		super(name,flowers, location);
		this.devloper=devloper;
	}
	public void printMadu() {
		super.printMadu();
		System.out.println(this.devloper);
	}

	
	

}
