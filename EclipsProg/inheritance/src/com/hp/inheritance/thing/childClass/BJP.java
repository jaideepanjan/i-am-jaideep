package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.PoliticalParty;

public class BJP extends PoliticalParty {
	public String president;

	
	public BJP() {
		} 
	
	
	public BJP(String fullFarm, int members, String logo,String president) {
		super(fullFarm,members, logo);
		this.president=president;
	}
	public void printMadu() {
		super.printMadu();
		System.out.println(this.president);
	}

}
