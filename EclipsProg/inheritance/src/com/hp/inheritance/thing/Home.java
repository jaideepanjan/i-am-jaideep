package com.hp.inheritance.thing;

public class Home {
	public int members;
	public String type;
	public boolean duplex;
	
	public Home() {
		System.out.println("Default constructer of Home");
	}

	public Home(int members, String type, boolean duplex) {
		this.members = members;
		this.type = type;
		this.duplex = duplex;
	}
	
     public void jointFamily() {
    	 System.out.println("Members in home : "+members);
    	 System.out.println("Type of Home : "+type);
    	 System.out.println("Isn't House id duplex : "+duplex);
    	 System.out.println("----------------------------");
    	 
     }
     
     public void SeparateFamily () {
    	 System.out.println("SeparateFamily");
    	 System.out.println("----------------------------");

     }

}
