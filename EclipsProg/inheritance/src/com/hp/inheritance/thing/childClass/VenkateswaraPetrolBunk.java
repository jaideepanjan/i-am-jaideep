package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.PetrolBunk;

public class VenkateswaraPetrolBunk extends PetrolBunk {
	public String owner;
	
	public VenkateswaraPetrolBunk(String brand, double site, boolean quality,String owner) {
		super(brand,site,quality);
		this.owner=owner;
	}
	
	public void menEmploy() {
		super.menEmploy();
		System.out.println("Petrol Bunk Owner name : "+owner);
	}
	
	public void womenEmploy() {
		System.out.println("5% extra salery foe Women Employes ");
	}

}
