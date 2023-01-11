package com.hp.streem.dto;

import java.time.LocalDate;

import com.hp.streem.constants.Typee;

public class WeaponDTO {
	
	private String name;
	private String madeBy;
	private String madeOf;
	private double price;
	private Typee type;
	
	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, String string, double price, Typee type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOf = madeOf;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOf=" + madeOf + ", price=" + price + ", type="
				+ type + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public int compareTo(WeaponDTO o) {
		
		return o.name.compareTo(this.name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto=(WeaponDTO)obj;
				if(this.name.equals(dto.name))
				{
					System.out.println("same name : +this.name");
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

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Typee getType() {
		return type;
	}

	public void setType(Typee type) {
		this.type = type;
	}

	
	
	
	

}
