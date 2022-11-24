package com.hp.equals.things;

public class Paint {
	public String brand;
	public String type;
	public String colour;
	public double price;
	public String compName;
	public String brandAmbasitor;
	public float rating;
	public int quantity;
	public boolean worthy;
	public String madeIn;
	
	
	public Paint(String brand, String type, String colour, double price, String compName, String brandAmbasitor,
			float rating, int quantity, boolean worthy, String madeIn) {
		this.brand = brand;
		this.type = type;
		this.colour = colour;
		this.price = price;
		this.compName = compName;
		this.brandAmbasitor = brandAmbasitor;
		this.rating = rating;
		this.quantity = quantity;
		this.worthy = worthy;
		this.madeIn = madeIn;
	}
	@Override
	public boolean equals(Object other) {
		System.out.println("Running equals method in paint");
		if(other instanceof Paint) {
		System.out.println("Other is paint, can check the  ");	
		}
	}
	
	

}
