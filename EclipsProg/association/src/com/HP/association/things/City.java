package com.HP.association.things;

public class City {
	public String name;
	public String founder;
	public long since;
	public String anotherName;
	public long area;
	
	public City(String name,String founder,long since,String anotherName,long area) {
		super();
		this.name=name;
		this.founder=founder;
		this.since=since;
		this.anotherName=anotherName;
		this.area=area;
	}
	public void printMadu() {
		System.out.println("Name of the city : "+name);
		System.out.println("Founder of the city : "+founder);
		System.out.println("Established on : "+since);
		System.out.println("Also called as : "+anotherName);
		System.out.println("Area of the city : "+area);
	}

}
