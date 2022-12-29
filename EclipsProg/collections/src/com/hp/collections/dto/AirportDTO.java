package com.hp.collections.dto;

import java.io.Serializable;

public class AirportDTO implements Serializable {
	
	private String name;
	private String streem;
	private String shape;
	private Double area;
	private Double noOfFlights;
	
	public AirportDTO() {
		System.out.println("Running default constructer");
	}

	public AirportDTO(String name, String streem, String shape, Double atea, Double noOfFlights) {
		super();
		this.name = name;
		this.streem = streem;
		this.shape = shape;
		this.area = area;
		this.noOfFlights = noOfFlights;
	}
	
	public boolean equals (Object obj) {
		if(obj !=null) {
			if(obj instanceof AirportDTO) {
				AirportDTO dto=(AirportDTO)obj;
				if(dto.streem.equals(this.streem)) {
					System.out.println("The Streem is matched "+dto);
					return true;
				}
				else {
					System.err.println("The Streem is not matched "+dto);
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", streem=" + streem + ", shape=" + shape + ", area=" + area
				+ ", noOfFlights=" + noOfFlights + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreem() {
		return streem;
	}

	public void setStreem(String streem) {
		this.streem = streem;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getNoOfFlights() {
		return noOfFlights;
	}

	public void setNoOfFlights(Double noOfFlights) {
		this.noOfFlights = noOfFlights;
	}
	
	
	
	
	
	
	
	

}
