package com.hp.helmet.dto;

import java.time.LocalDateTime;

import com.hp.helmet.constant.Color;
import com.hp.helmet.constant.HelmetType;

public class HelmetDTO extends AbstractAuditeHelmetDTO{
	
	private String brand;
	private HelmetType type;
	private Double price;
	private Color color;
	
	public HelmetDTO() {
		super();
		System.out.println("Running default constructer of HelmetDTO");
	}

	public HelmetDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updateDate) {
		super(createdBy, createdDate, updatedBy, updateDate);
		System.out.println("Running parameterised constructer ");
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedBy()="
				+ getUpdatedBy() + ", getUpdateDate()=" + getUpdateDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
	
	

}
