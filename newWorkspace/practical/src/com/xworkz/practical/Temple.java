package com.xworkz.practical;

public class Temple {
	
	public String details(String templeName) {
		return templeName;
		
	}
	public int details(int entryFee) {
		return entryFee;
	}
	
	public String details(String nameOfPoojari,String typeOfGopura) {
		return nameOfPoojari+typeOfGopura;
	}
	
	
	public static void main(String[] args) {
		
		
		
		Temple temple=new Temple();
		int num=temple.details(120);
		String nam=temple.details("Dharmastala");
		String type=temple.details("Poojarayya", "Hoysala");
		System.out.println("Temple Name : "+nam);
		System.out.println("Entry fee : "+num);
		System.out.println("name of poojari and type of gopura: "+type);
		
		
	}
	
	

}
