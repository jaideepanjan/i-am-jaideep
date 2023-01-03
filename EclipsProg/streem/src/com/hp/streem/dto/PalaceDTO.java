package com.hp.streem.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable {
	
	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private double visitingFee;
	
	public PalaceDTO() {
		
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, double visitingFee) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFee = visitingFee;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyedBy="
				+ destroyed + ", visitingFee=" + visitingFee + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PalaceDTO) {
				PalaceDTO dto=(PalaceDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("Names are equal : "+this.name);
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getVisitingFee() {
		return visitingFee;
	}

	public void setVisitingFee(double visitingFee) {
		this.visitingFee = visitingFee;
	}

	
	
	

}
