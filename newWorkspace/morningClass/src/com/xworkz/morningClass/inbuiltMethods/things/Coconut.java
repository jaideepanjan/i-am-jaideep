package com.xworkz.morningClass.inbuiltMethods.things;

public class Coconut {
	
	private float size;
	private boolean nati;
	private String colour;
	private String type;
	
	public Coconut() {
		System.out.println("Running no arg cons in Coconut"); 
	}

	@Override
	public String toString() {
		return "Coconut [size=" + size + ", nati=" + nati + ", colour=" + colour + ", type=" + type + ", toString()="
				+ super.toString() + "]";
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public boolean isNati() {
		return nati;
	}

	public void setNati(boolean nati) {
		this.nati = nati;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
