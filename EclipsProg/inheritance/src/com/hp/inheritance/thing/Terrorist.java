package com.hp.inheritance.thing;

public class Terrorist {
	public String name;
	public String intension;
	public String country;
	
	public Terrorist() {
		System.out.println("Default constructer of Terrorist");
	}

	public Terrorist(String name, String intension, String country) {
		this.name = name;
		this.intension = intension;
		this.country = country;
	}
	
     public void fullName() {
    	 System.out.println("Nmae of the terrorist : "+name);
    	 System.out.println("Intension of the terrorist : "+intension);
    	 System.out.println("Countyr name of terrorist : "+country);
    	 System.out.println("----------------------------");
    	 
     }
     
     public void nickName() {
    	 System.out.println("Terrorist has nic names also");
    	 System.out.println("----------------------------");

     }

}
