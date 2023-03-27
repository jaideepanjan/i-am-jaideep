package com.xworkz.morningClass.EqualMethod;

public class Alcohol {
	
	private String brand;
	private double percentage;
	private String type;
	private String price;
	
	public Alcohol() {
		System.out.println("Running no arg cons in Alcohol");
	}

	public Alcohol(String brand, double percentage, String type, String price) {
		super();
		this.brand = brand;
		this.percentage = percentage;
		this.type = type;
		this.price = price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in Alcohol");
		if(obj!=null) {
			System.out.println("Object is not pointig to null");
			if(obj instanceof Alcohol) {
				System.out.println("Obj is instance of Alcohol can compare");
				Alcohol casted=(Alcohol)obj;
				Alcohol alcohol=this;
				Alcohol alcohol2=casted;
				if(alcohol.brand.equals(alcohol2.brand)&&alcohol.percentage==alcohol2.percentage&&alcohol.price==alcohol2.price&&alcohol.type.equals(alcohol2.type)) {
					System.out.println("Alcohol 1 and Alcohol2 both r same");
					return true;
				}
				else {
					System.out.println("Alcohol1 and Alcohol2 bothe are not Same");
				}
			}
			else {
				System.out.println("Obj is not instance of Alcohol can't compare");
			}
		}
		else {
			System.out.println("Object is pointing to null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Alcohol [brand=" + brand + ", percentage=" + percentage + ", type=" + type + ", price=" + price + "]";
	}
	
	


	
	

}
