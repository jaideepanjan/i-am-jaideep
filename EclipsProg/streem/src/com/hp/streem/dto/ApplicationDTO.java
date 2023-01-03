package com.hp.streem.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {
	
	private String name;
	private double version;
	private boolean free;
	private String devlopedBy;
	private double price;
	
	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDTO(String name, double version, boolean free, String devlopedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.devlopedBy = devlopedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", devlopedBy=" + devlopedBy
				+ ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof ApplicationDTO)
			{
				ApplicationDTO dto= (ApplicationDTO)obj;
				if(dto.devlopedBy.equals(this.devlopedBy))
				{
					System.out.println(this.devlopedBy);
					return true;
				}
			}
		}
		return false;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevlopedBy() {
		return devlopedBy;
	}

	public void setDevlopedBy(String devlopedBy) {
		this.devlopedBy = devlopedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
