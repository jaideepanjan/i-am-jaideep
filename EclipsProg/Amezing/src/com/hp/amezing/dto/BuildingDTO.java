package com.hp.amezing.dto;

import java.time.LocalDateTime;

import com.hp.amezing.constant.Type;

public class BuildingDTO extends AbstractAuditDTO {
	
	private int number;
	private String name;
	private byte floors;
	private boolean lift;
	private char parkingSlotes;
	private Type type;
	
	
	
	public BuildingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BuildingDTO(int number, String name, byte floors, boolean lift, char parkingSlotes, Type type) {
		this.number = number;
		this.name = name;
		this.floors = floors;
		this.lift = lift;
		this.parkingSlotes = parkingSlotes;
		this.type = type;
	}



	@Override
	public String toString() {
		return "BuildingDTO [number=" + number + ", name=" + name + ", floors=" + floors + ", lift=" + lift
				+ ", parkingSlotes=" + parkingSlotes + ", type=" + type + ", getCreatedBy()=" + getCreatedBy()
				+ ", getCreatedDate()=" + getCreatedDate() + "]";
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public byte getFloors() {
		return floors;
	}



	public void setFloors(byte floors) {
		this.floors = floors;
	}



	public boolean isLift() {
		return lift;
	}



	public void setLift(boolean lift) {
		this.lift = lift;
	}



	public char getParkingSlotes() {
		return parkingSlotes;
	}



	public void setParkingSlotes(char parkingSlotes) {
		this.parkingSlotes = parkingSlotes;
	}



	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}
	
		
	

}
