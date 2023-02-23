
package com.xworkz.morningClass.inbuiltMethods.things;

public class Adike {
	
	private String color;
	private String plantName;
	private double price;
	private double quantity;
	
	public Adike() {
		System.out.println("Running no arg cons");
	}

	public Adike(String color, String plantName, double price, double quantity) {
		
		this.color = color;
		this.plantName = plantName;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Adike [color=" + color + ", plantName=" + plantName + ", price=" + price + ", quantity=" + quantity
				+ ", toString()=" + super.toString() + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
