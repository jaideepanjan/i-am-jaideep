package com.HP.association.things;

public class Country {
	public String name;
	public double population;
	public float incomeRatio;
	public String capital;
	
	
	public Country(String name, double population, float incomeRatio, String capital) {
		super();
		this.name = name;
		this.population = population;
		this.incomeRatio = incomeRatio;
		this.capital = capital;
	}
	
	public void printMadu() {
		System.out.println("Name of the country : "+name);
		System.out.println("Population of the country : "+population +"Billion");
		System.out.println("Income ratio of the country : "+incomeRatio+"Thousand Rupes");
		System.out.println("Capital of the Country : "+capital);
	}

}
