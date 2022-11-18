package com.HP.association.things;

public class Address {
	public Locationn locationn;
	
	public Address() {
		
	}
	
	public void setLocation(Locationn locationn) {
		this.locationn=locationn;
	}
	
	public void printmadu() {
		if(this.locationn!=null) {
			this.locationn.printMadu();
		}
	}

}
