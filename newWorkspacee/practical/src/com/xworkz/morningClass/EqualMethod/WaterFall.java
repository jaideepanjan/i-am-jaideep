package com.xworkz.morningClass.EqualMethod;

public class WaterFall {
	
	
	private String name;
	private double height;
	private String location;
	
	public WaterFall() {
		System.out.println("Running no arg cons in Waterfall");
	}

	public WaterFall(String name, double height, String location) {
		
		this.name = name;
		this.height = height;
		this.location = location;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in WaterFall");
		if(obj!=null) {
			System.out.println("Object is not null");
			if(obj instanceof WaterFall) {
				System.out.println("Object is instance of WaterFall can compare");
				WaterFall casted=(WaterFall)obj;
				WaterFall waterFall=this;
				WaterFall waterFall2=casted;
				if(waterFall.name.equals(waterFall2.name)&&waterFall.height==waterFall2.height&&waterFall.location.equals(waterFall2.location)) {
					System.out.println("Waterfalls1 and watrfalse2 both are same can compare");
					return true;
				}
				else {
					System.out.println("Waterfall1 and waterfall2 is not same");
				}
			}
			else {
				System.out.println("object is not instance of Waterfall can't compare");
			}
		}
		else {
			System.out.println("Object is null");
		}
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "WaterFall [name=" + name + ", height=" + height + ", location=" + location + "]";
	}
	
	
	
	
	
	

}
