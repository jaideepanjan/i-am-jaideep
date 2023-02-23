package com.xworkz.practical.encapsulation.things;

public class Myself {
	
	private String name;
	private int age;
	private double waight;
	private String color;
	
	public Myself() {
		System.out.println("Running no-arg constructer in myself");
	}

	@Override
	public String toString() {
		return "Myself [name=" + name + ", age=" + age + ", waight=" + waight + ", color=" + color + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWaight() {
		return waight;
	}

	public void setWaight(double waight) {
		this.waight = waight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
