package com.xworkz.morningClass.object;

public class Cricket extends Sport {

	private String country;
	private String coatchName;

	public Cricket() {
		System.out.println("Running no-arg cons in cricket");
	}

	public Cricket(String country, String coatchName) {
		super();
		this.country = country;
		this.coatchName = coatchName;
	}

	public String getCountry() {
		return country;
	}

	public String getCoatchName() {
		return "Bharath";
	}
	
	Sport sport1=new Sport();
	
}
