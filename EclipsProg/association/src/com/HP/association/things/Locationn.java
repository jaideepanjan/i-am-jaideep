package com.HP.association.things;

public class Locationn {
	public long number;
	public String street;
	public City city;
	public State state;
	public Country country;
	
	public Locationn(long number,String street) {
		super();
		this.number=number;
		this.street=street;
	}
	public void setMethods(City city,State state,Country country) {
		this.city=city;
		this.state=state;
		this.country=country;		
	} 
	
	public void printMadu() {
		System.out.println("Location number : "+number);
		System.out.println("Street : "+street);
		if(this.city!=null) {
			this.city.printMadu();
		}
		if(this.state!=null) {
			this.state.printMadu();
		}
		if(this.country!=null) {
			this.country.printMadu();
		}
	}

}
