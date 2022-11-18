package com.HP.association.things;

public class State {
	public String name;
	public String cheifMinister;
	public int noOfRivers;
	public String language;
	
	public State(String name,String cheifMinister,int noOfRivers,String language) {
		super();
		this.name=name;
		this.cheifMinister=cheifMinister;
		this.noOfRivers=noOfRivers;
		this.language=language;		
	}
	public void printMadu() {
		System.out.println("Name of the State : "+name);
		System.out.println("Cheif Minister of the State : "+cheifMinister);
		System.out.println("Number of Rivers in the State : "+noOfRivers);
		System.out.println("Language of the State : "+language);
	}
	

}
