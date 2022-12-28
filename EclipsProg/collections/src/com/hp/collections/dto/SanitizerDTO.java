package com.hp.collections.dto;

public class SanitizerDTO {
	
	private String id;
	private String producedBy;
	private String country;
	private Double price;
	
	public SanitizerDTO() {
	}

	public SanitizerDTO(String id, String producedBy, String country, Double price) {
		super();
		this.id = id;
		this.producedBy = producedBy;
		this.country = country;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	

}
