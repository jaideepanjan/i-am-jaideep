package com.hp.inheritance.thing;

public class Catering {
	
	public String name;
	public long gstNo;
	public String dressCode;
	public String officLocation;
	
	public Catering() {
		System.out.println("Default constructer of Catering");
	}

	public Catering(String name, long gstNo, String dressCode, String officLocation) {
		this.name = name;
		this.gstNo = gstNo;
		this.dressCode = dressCode;
		this.officLocation = officLocation;
	}
	
	public void printMadu() {
		System.out.println(name);
		System.out.println(gstNo);
		System.out.println(dressCode);
		System.out.println(officLocation);
	}
	

}
