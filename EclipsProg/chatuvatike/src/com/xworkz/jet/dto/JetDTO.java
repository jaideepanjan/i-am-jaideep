package com.xworkz.jet.dto;

import java.util.Objects;

public class JetDTO {

	private String name;
	private double weight;
	private String colour;
	private int noOfSeats;
	private float gravity;

	public JetDTO() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "JetDTO [name=" + name + ", weight=" + weight + ", colour=" + colour + ", noOfSeats=" + noOfSeats
				+ ", gravity=" + gravity + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(colour, gravity, name, noOfSeats, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JetDTO other = (JetDTO) obj;
		return Objects.equals(colour, other.colour)
				&& Float.floatToIntBits(gravity) == Float.floatToIntBits(other.gravity)
				&& Objects.equals(name, other.name) && noOfSeats == other.noOfSeats
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	public JetDTO(String name, double weight, String colour, int noOfSeats, float gravity) {
		super();
		this.name = name;
		this.weight = weight;
		this.colour = colour;
		this.noOfSeats = noOfSeats;
		this.gravity = gravity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public float getGravity() {
		return gravity;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}

}
