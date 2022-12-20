package com.hp.amezing.dto;

import java.time.LocalDateTime;

public class RailwayStationDTO extends AbstractAuditDTO {
	
	private String name;
	private byte noOfPlatform;
	private String area;
	private int platForTicketPrice;
	
	public RailwayStationDTO() {
		super();
		System.out.println("Running default contructer Railway Station DTO ");
	}

	

	public RailwayStationDTO(String name, byte noOfPlatform, String area, int platForTicketPrice) {
		this.name = name;
		this.noOfPlatform = noOfPlatform;
		this.area = area;
		this.platForTicketPrice = platForTicketPrice;
	}



	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatform=" + noOfPlatform + ", area=" + area
				+ ", platForTicketPrice=" + platForTicketPrice + ", toString()=" + super.toString() + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public byte getNoOfPlatform() {
		return noOfPlatform;
	}



	public void setNoOfPlatform(byte noOfPlatform) {
		this.noOfPlatform = noOfPlatform;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public int getPlatForTicketPrice() {
		return platForTicketPrice;
	}



	public void setPlatForTicketPrice(int platForTicketPrice) {
		this.platForTicketPrice = platForTicketPrice;
	}
	
	
	
	

}
