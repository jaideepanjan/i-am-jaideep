package com.hp.copy.thing;

public class Mobile {
	
	public String anotherName;
	public String madeIn;
	public boolean useability;
	public boolean portable;
	public float custermerReview;
	public String[] brands;
	public String[] types;
	public long[] modles;
	public long[] price;
	public String[] colours;
	public int[] rams;
	
	public Mobile(String anotherName,String madeIn,boolean useability,boolean portable,float custermerReview,String[] brands,String[] types,long[] modles,long[] price,String[] colours,int[] rams)
	{
		System.out.println("Parameterised constructor of Class Mobile");
		this.anotherName=anotherName;
		this.madeIn=madeIn;
		this.useability=useability;
		this.portable=portable;
		this.custermerReview=custermerReview;
		this.brands=brands;
		this.types=types;
		this.modles=modles;
		this.price=price;
		this.colours=colours;
		this.rams=rams;
	}
	public void enterDetails() {

		
		System.out.println("Another name of Mobile : "+this.anotherName);
		System.out.println("Mobile product made in : "+this.madeIn);
		System.out.println("Is useability of mobile is good : "+this.useability);
		System.out.println("Is mobile can portable : "+this.portable);
		System.out.println("Custemer review about Mobile : "+this.custermerReview);
		System.out.println("Different bbrands of mobile : "+this.brands);
		System.out.println("Different types of Mobile : "+this.types);
		System.out.println(" Different models of Mobile : "+this.modles);
		System.out.println("Prices : "+this.price);
		System.out.println("Different colours : "+this.colours);
		System.out.println("DIfferent RAMs :"+this.rams);
		
		System.out.println("loop of elements");
		
		for (int i = 0; i < this.brands.length; i++) {
			String brands = this.brands[i];
			System.out.println(brands);
			
		}
		for (int i = 0; i < this.types.length; i++) {
			String types = this.types[i];
			System.out.println(types);
			
		}
		for (int i = 0; i < this.modles.length; i++) {
			long modles = this.modles[i];
			System.out.println(modles);
			
		}
		for (int i = 0; i < this.price.length; i++) {
			long price = this.price[i];
			System.out.println(price);
			
		}
		for (int i = 0; i < this.colours.length; i++) {
			String colours = this.colours[i];
			System.out.println(colours);
			
		}
		for (int i = 0; i < this.rams.length; i++) {
			int qualityes = this.rams[i];
			System.out.println(rams);
			
		}

		
			
	
	}
	

}
