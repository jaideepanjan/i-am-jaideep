package com.xworkz.morningClass.inbuiltMethods.things;

public class Paint {
	
	private String color;
	private String brand;
	private String brandAmbasiter;
	private String ceo;
	
	public Paint() {
		System.out.println("Running no arg cons in Paint");	
		}

	@Override
	public String toString() {
		return "Paint [color=" + color + ", brand=" + brand + ", brandAmbasiter=" + brandAmbasiter + ", ceo=" + ceo
				+ "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrandAmbasiter() {
		return brandAmbasiter;
	}

	public void setBrandAmbasiter(String brandAmbasiter) {
		this.brandAmbasiter = brandAmbasiter;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	

}
