package com.hp.inheritance.thing;

public class PetrolBunk {
	public String brand;
	public double site;
	public boolean quality;
	
	public PetrolBunk() {
	}

	public PetrolBunk(String brand, double site, boolean quality) {
		this.brand = brand;
		this.site = site;
		this.quality = quality;
	}
	
	public void menEmploy() {
		System.out.println("Brand of Petrol : "+brand);
		System.out.println("Site dimention : "+site +"cm Square");
		System.out.println(" isn't Quality of petrol is good : "+quality);
	}
	
	public void womenEmploy() {
		System.out.println("Only day shift for Women employes  ");
	}

}
