package com.hp.inheritance.boot;

import com.hp.inheritance.thing.PetrolBunk;
import com.hp.inheritance.thing.childClass.VenkateswaraPetrolBunk;

public class PetrolBunkRunner {

	public static void main(String[] args) {
		
		PetrolBunk petrolBunk=new PetrolBunk();
		petrolBunk.menEmploy();
		petrolBunk.womenEmploy();
		
		VenkateswaraPetrolBunk venkateswaraPetrolBunk=new VenkateswaraPetrolBunk("Indian", 1535, true, "Jaideep");
		venkateswaraPetrolBunk.menEmploy();
		venkateswaraPetrolBunk.womenEmploy();

	}

}
