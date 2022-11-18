package com.hp.inheritance.thing;

public class Party {
	public String reasion;
	public int members;
	public String colourCode;
	
	
	public Party(String reasion, int members, String colourCode) {
		this.reasion = reasion;
		this.members = members;
		this.colourCode = colourCode;
	}
	
	public void printMadu() {
		System.out.println("Reasion of the party : "+reasion);
		System.out.println("How many members can attend the party : "+members);
		System.out.println("Dress Code or Dress Style of the party :  "+colourCode);
	}
	
	

}
