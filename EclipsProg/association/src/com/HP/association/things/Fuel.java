package com.HP.association.things;

import com.HP.association.constants.*;


public class Fuel {
	public Brand brand;
	public boolean Special;
	public FuelTypes type=FuelTypes.KEROSENE;
	public double price;
	public double quantity;
	
	public Fuel(boolean Special,double price,double quantity) {
		super();
		this.Special=Special;
		this.price=price;
		this.quantity=quantity;
	}
	public void totalPrice() {
		double total=this.price *quantity;
		System.out.println("Total Price" +this.price +"RS");
	}
	
	public void reading() {
		System.out.println("Fuel Details");
		Brand brand=new Brand("Reliance", "256FG25SGFE45", "Bhadravathi", "4.5star");
		brand.showoff();
		System.out.println("Is Fuel is Special : " +this.Special);
		System.out.println("Price of the Fuel is : " +this.price);
		System.out.println("Quantity of the Fuel is : " +this.quantity +"Let");
		System.out.println("Type of the Fuel is : " +this.type);
	}

}
