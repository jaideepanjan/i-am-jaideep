package com.hp.inheritance.thing;

public class Criminal {
	public String type;
	public int age;
	public boolean realyCriminal;
	
	public Criminal() {
		
	}
	
	public Criminal(String type, int age, boolean realyCriminal) {
		this.type = type;
		this.age = age;
		this.realyCriminal = realyCriminal;
	}



	public void printMadu() {
		System.out.println("Name of the Shoping Mall : "+type);
		System.out.println("Number of floers in Mall : "+age);
		System.out.println("Location of the Mall : "+realyCriminal);
	}


}
