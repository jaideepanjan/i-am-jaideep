package com.hp.inheritance.thing;

public class WarJet {
	public int height;
	public String colour;
	public double width;
	
	public WarJet() {
		System.out.println("Default constructer of Home");
	}

	public WarJet(int members, String type, boolean duplex) {
		this.height = height;
		this.colour = colour;
		this.width = width;
	}
	
     public void fly() {
    	 System.out.println("Height of  the Jet : "+height +"meters");
    	 System.out.println("Colour of the Jet: "+colour);
    	 System.out.println("Width of  the Jet : "+width +"meters");
    	 System.out.println("----------------------------");
    	 
     }
     
     public void fight () {
    	 System.out.println("Use in war time to fight againest edurali");
    	 System.out.println("----------------------------");

     }

}
