package com.hp.inheritance.thing;

public class Director {
	public String type;
	public int experience;
	public int noOfFilms;
	public boolean creative;
	
	public Director() {
		
	}
		public Director(String type, int experience, int noOfFilms, boolean creative) {
		this.type = type;
		this.experience = experience;
		this.noOfFilms = noOfFilms;
		this.creative = creative;
	}
	public void printMadu() {
		System.out.println("Name of the Shoping Mall : "+type);
		System.out.println("Number of floers in Mall : "+experience);
		System.out.println("Location of the Mall : "+noOfFilms);
		System.out.println("Creative director : "+creative);
	}

}
