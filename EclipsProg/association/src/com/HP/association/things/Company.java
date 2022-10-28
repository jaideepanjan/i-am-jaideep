package com.HP.association.things;

public class Company {
	
	public String name;
	public String type;
	public Company(String name,String type) {
		super();
		this.name=name;
		this.type=type;
		}
	public void showoff() {
		System.out.println("Invoking the company");
		System.out.println(this.name);
		System.out.println(this.type);
		
	}
}
