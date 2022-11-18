package com.hp.inheritance.thing;

public class ShopingMall {
	
	public String name;
	public int floers;
	public String location;
	
	public ShopingMall() {
		
	}
	
	public ShopingMall(String name, int flowers, String location) {
		this.name = name;
		this.floers = floers;
		this.location = location;
	}



	public void printMadu() {
		System.out.println("Name of the Shoping Mall : "+name);
		System.out.println("Number of floers in Mall : "+floers);
		System.out.println("Location of the Mall : "+location);
	}

}
