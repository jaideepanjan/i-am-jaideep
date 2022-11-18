package com.hp.inheritance.thing;

public class HumanResourse1 {
	public String name;
	public String qualification;
	public String from;
	
	public HumanResourse1() {
		System.out.println("Default constructer of Human Resource");
	}

	public HumanResourse1(String name, String qualification, String from) {
		this.name = name;
		this.qualification = qualification;
		this.from = from;
	}
	
     public void responsibility() {
    	 System.out.println("Nmae of the HR : "+name);
    	 System.out.println("Qualification of the HR : "+qualification);
    	 System.out.println("HR Native : "+from);
    	 System.out.println("----------------------------");
    	 
     }
     
     public void power() {
    	 System.out.println("HR has the power of hiring students");
    	 System.out.println("----------------------------");

     }

}
