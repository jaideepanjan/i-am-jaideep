package com.HP.association.things;

public class Companyy {
	public String name;
	public String ownerName;
	public Address address;
	
	public Companyy(String name,String ownerName) {
		super();
		this.name=name;
		this.ownerName=ownerName;
		
		}
	public void setAddress(Address address) {
		this.address=address;
	}
	public void printMadu() {
		System.out.println("Name of the Company : "+this.name);
		System.out.println("Company owner name : "+this.ownerName);
		if(this.address!=null) {
			this.address.printmadu();
		}
	}
	

}
