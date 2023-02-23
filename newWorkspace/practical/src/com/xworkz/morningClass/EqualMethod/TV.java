package com.xworkz.morningClass.EqualMethod;

public class TV {
	
	private String brand;
	private double price;
	private double size;
	
	public TV() {
		System.out.println("Running no arg cons in TV");
	}

	public TV(String brand, double price, double size) {
		
		this.brand = brand;
		this.price = price;
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in TV"+obj);
		
		if(obj!=null) {
			System.out.println("Object is not null");
			if(obj instanceof TV) {
				System.out.println("Object is instance of TV can compare");
				TV casted=(TV)obj;
				TV tv=this;
				TV tv2=casted;
				if(tv.brand.equals(tv2.brand) && tv.price==(tv2.price)&&tv.size==tv2.size  ) {
					System.out.println("TV1 and TV2 both are same");
					return true;
					
				}
				else {
					System.out.println("TV1 and TV2 both are not same");
				}
			}
			else {
				System.out.println("Object is not instance of tv Can't compare");
			}
		}
		else {
			System.out.println("Object is null");
		}
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "TV [brand=" + brand + ", price=" + price + ", size=" + size + "]";
	}
	
	
	
	

}
