package com.HP.association.things;

public class God {
	public  String name;
	public String gender;
	public String mainPower;
	public Weapon weapon;


Public God(String name,String gender,String mainPower) {
	super();
	this.name=name;
	this.gender=gender;
	this.mainPower=mainPower;
	}

public void showoff() {
	System.out.println("Name of the God : " +name);
	System.out.println("The God is : " +gender);
	System.out.println("The main power of God is : " +mainPower);
	Weapon weapon =new Weapon("Chakra","Hold in Finger", 4.54);
	weapon.showoff();
}
}