package com.xworkz.morningClass.EqualMethod;

public class Fish {
	private String name;
	private String colour;
	private double width;
	private boolean sharp;
	private double height;
	
	public Fish() {
		System.out.println("Running no arg cond in fish");
	}

	public Fish(String name, String colour, double width, boolean sharp, double height) {
		super();
		this.name = name;
		this.colour = colour;
		this.width = width;
		this.sharp = sharp;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals ,ethod in fish");
		if(obj!=null) {
			System.out.println("Object is not null");
			if(obj instanceof Fish) {
				System.out.println("Obj is onstance of Fish can compare");
				Fish casted=(Fish)obj;
				Fish fish=this;
				Fish fish2=casted;
				if(fish.name.equals(fish2.name)&&fish.colour.equals(fish2.colour.equals(fish2.colour)&&fish.width==fish2.width&&fish.sharp==fish2.sharp&&fish.height==fish2.height)) {
					System.out.println("Fish1 and fish 2 both are same");
					return true;
				}
				else {
					System.out.println("Fish1 and fish 2 both are not same");
				}
			}
			else {
				System.out.println("Obj is onstance of Fish can compare");
			}
		}
		else {
			System.out.println("object is null");
		}
		
		
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + ", colour=" + colour + ", width=" + width + ", sharp=" + sharp + ", height="
				+ height + "]";
	}
	
	
	

}
