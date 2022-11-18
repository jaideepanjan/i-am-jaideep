package com.hp.inheritance.thing;

public class Invitation {
	public String type;
	public boolean nonPlastic;
	public char size;
	
	public Invitation() {
		System.out.println("Default Constructer of Invitation");
	}
	
	public Invitation(String type, boolean nonPlastic, char size) {
		this.type = type;
		this.nonPlastic = nonPlastic;
		this.size = size;
	}
	
	public void printMadu() {
		System.out.println(type);
		System.out.println(nonPlastic);
		System.out.println(size);
	}

}
