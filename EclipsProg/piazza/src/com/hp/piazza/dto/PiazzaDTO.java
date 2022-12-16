package com.hp.piazza.dto;

import com.hp.piazza.constant.PiazzaSize;

public class PiazzaDTO extends AbstractAuditPizza {
	
	private String name;
	private String company;
	private PiazzaSize size;
	private boolean cheese;
	private double price;
	private String flavour;
	private String type;
	
	
	@Override
	public String toString() {
		return "PiazzaDTO [name=" + name + ", company=" + company + ", size=" + size + ", cheese=" + cheese + ", price="
				+ price + ", flavour=" + flavour + ", type=" + type + ", getCreatedBy()=" + getCreatedBy()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getUpdateBy()=" + getUpdateBy() + ", getUpdateDate()="
				+ getUpdateDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public PiazzaDTO() {
		super();
		System.out.println("Calling the Defaul Constructer of Piazza DTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PiazzaSize getSize() {
		return size;
	}

	public void setSize(PiazzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
	
	

}
