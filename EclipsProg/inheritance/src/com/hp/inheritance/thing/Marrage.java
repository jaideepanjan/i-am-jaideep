package com.hp.inheritance.thing;

public class Marrage {
	public String style;
	public int members;
	public boolean registration;
	public String venu;
	
	public Marrage() {
		System.out.println("Default constructer of Marrage");
	}

	public Marrage(String style, int members, boolean registration, String venu) {
		this.style = style;
		this.members = members;
		this.registration = registration;
		this.venu = venu;
	}

	
	
	public void printMadu() {
		System.out.println(style);
		System.out.println(members);
		System.out.println(registration);
		System.out.println(venu);
	}

}
