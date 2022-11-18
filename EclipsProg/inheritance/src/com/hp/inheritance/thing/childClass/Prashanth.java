package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.Director;

public class Prashanth extends Director {
	public String nicName;
	
	 public Prashanth() {
	}
	 public Prashanth(String type, int experience, int noOfFilms, boolean creative) {
		 super(type,experience,noOfFilms,creative);
		 this.nicName=nicName;
	 }
	 public void printMadu() {
		 super.printMadu();
		 System.out.println(this.nicName);
	 }

}
