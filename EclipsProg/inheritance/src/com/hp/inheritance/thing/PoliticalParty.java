package com.hp.inheritance.thing;

public class PoliticalParty {
	public String fullFarm;
	public int members;
	public String logo;
	
	public PoliticalParty() {
		
	}
	
	public PoliticalParty(String fullFarm, int members, String logo) {
		this.fullFarm = fullFarm;
		this.members = members;
		this.logo = logo;
	}



	public void printMadu() {
		System.out.println("Name of the Shoping Mall : "+fullFarm);
		System.out.println("Number of floers in Mall : "+members);
		System.out.println("Location of the Mall : "+logo);
	}

}
