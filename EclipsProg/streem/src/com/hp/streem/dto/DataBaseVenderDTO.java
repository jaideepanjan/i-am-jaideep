package com.hp.streem.dto;

import java.io.Serializable;

import com.hp.streem.constants.Type;

public class DataBaseVenderDTO implements Serializable {
	
	private String name;
	private String devlopedBy;
	private Type type;
	private double size;
	private double licenseCost;
	
	public DataBaseVenderDTO() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVenderDTO(String name, String devlopedBy, Type type, double size, double licenseCost) {
		super();
		this.name = name;
		this.devlopedBy = devlopedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVenderDTO [name=" + name + ", devlopedBy=" + devlopedBy + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + ", toString()=" + super.toString() + "]";
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
		if(obj instanceof DataBaseVenderDTO)
		{
			DataBaseVenderDTO dto = (DataBaseVenderDTO)obj;
			System.out.println(dto);
			return true;
			
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

	public String getDevlopedBy() {
		return devlopedBy;
	}

	public void setDevlopedBy(String devlopedBy) {
		this.devlopedBy = devlopedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}
	
	

}
