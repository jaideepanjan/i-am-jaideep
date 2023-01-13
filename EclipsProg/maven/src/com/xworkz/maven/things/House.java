package com.xworkz.maven.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class House {
	
	@Autowired
	@Qualifier("houseName")
	private String name;
	@Autowired
	private int noOfFloures;
	@Autowired
	private String style;
	@Autowired
	private int siteNo;
	@Autowired
	@Qualifier("nameOfOwner")
	private String ownerName;
	@Autowired
	@Qualifier("isGardan")
	private boolean gardan;
	@Autowired
	@Qualifier("isOpenkitchen")
	private boolean openkitchen;
	@Autowired
	private int noOfRooms;
	@Autowired
	@Qualifier("isParkingSpace")
	private boolean parkingSpace;
	
	
	@Override
	public String toString() {
		return "House [name=" + name + ", noOfFloures=" + noOfFloures + ", Style=" + style + ", siteNo=" + siteNo
				+ ", ownerName=" + ownerName + ", gardan=" + gardan + ", openkitchen=" + openkitchen + ", noOfRooms="
				+ noOfRooms + ", parkingSpace=" + parkingSpace + "]";
	}
	
	

}
