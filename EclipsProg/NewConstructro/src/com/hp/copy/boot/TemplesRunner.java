package com.hp.copy.boot;

import com.hp.copy.thing.Temples;

public class TemplesRunner {

	public static void main(String[] args) {
		System.out.println("Accessing all details by calling the methods");
		short temples=150;
		
		String[] names= {"Murudeswara","Kolluru","Male Mahadeswara Betta","Shree Dharmastala","Sigandooru"};
	    String[] states= {"Andra Pradesh","Tamilnadu","Karnataka","Jammu Kasmieer"};
		String[] styles= {"Nagara","Dravida","Vesara"};
		String[] shapes= {"Nagara","Dravida","Vesara","Ellips","Rectangle"};
		String[] parts= {"Mukya Dwara","Garbagudi","Aadarastamba","Natya Mandira","Gopura"};
		String[] modeOfTraveling= {"Bus","Own Vehiculs","Train"};
		Temples devalaya=new Temples("India", true,true,true,4.2f,names,states, styles,shapes,parts,modeOfTraveling);
		
		devalaya.enterDetails();

	}

}
