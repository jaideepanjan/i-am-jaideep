package com.xworkz.practical.inheritance.SMHInheritance;

public class ParlerRunner {

	public static void main(String[] args) {
	
		MensParlour parler1=new MensParlour();
		parler1.hairStyle();
		parler1.goodLook();
		
		
		ChildrensParler parler2=new ChildrensParler();
		parler2.getReady();
		parler2.goodLook();
		parler2.hairStyle();
		
		
		System.out.println("-----------------------------");
		parler2.setName("Hair cut");
		
		System.out.println(parler2.getName());
		
		
		WomensParler parler3=new WomensParler();
		parler3.eybro();
		parler3.goodLook();

	}

}
