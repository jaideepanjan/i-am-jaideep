package com.xworkz.morningClass.EqualMethod;

public class Cake {
	
	private String flavour;
	private double weight;
	private String shape;
	private double price;
	
	public Cake() {
		System.out.println("Running no arg cons in Cake");
	}

	public Cake(String flavour, double weight, String shape, double price) {
		
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in Cake");
		
		if(obj!=null) {
			System.out.println("Object is not null");
			if(obj instanceof Cake) {
				System.out.println("Object is instance of Cake can compare");
				Cake casted=(Cake)obj;
				Cake cake=this;
				Cake cake2=casted;
				if(cake.flavour.equals(cake2.flavour)&&cake.weight==cake2.weight&&cake.shape.equals(cake2.shape)&&cake.price==cake2.price) {
					System.out.println("Cake 1 and Cake2 bothh are same");
					return true;
				}
				else {
					System.out.println("cake1 and Cake2 are not same");
				}
				
			
			}
			else {
				System.out.println("Object is not instance of cake can't compare");
			}
			
		}
		else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Cake [flavour=" + flavour + ", weight=" + weight + ", shape=" + shape + ", price=" + price + "]";
	}
	
	
	
	

}
