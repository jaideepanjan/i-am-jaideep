package com.hp.amezing.dto;

import java.time.LocalDateTime;

import com.hp.amezing.constant.FamousFor;

public class BakeryDTO extends AbstractAuditDTO {
	
	private String name;
	private String oenerName;
	private long contactNo;
	private String location;
	private FamousFor famousFor;
	
	public BakeryDTO() {
		System.out.println("Running Default constructer of Bakery DTO");
	}

	public BakeryDTO(String name, String oenerName, long contactNo, String location, FamousFor famousFor) {
		this.name = name;
		this.oenerName = oenerName;
		this.contactNo = contactNo;
		this.location = location;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", oenerName=" + oenerName + ", contactNo=" + contactNo + ", location="
				+ location + ", famousFor=" + famousFor + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOenerName() {
		return oenerName;
	}

	public void setOenerName(String oenerName) {
		this.oenerName = oenerName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public FamousFor getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(FamousFor famousFor) {
		this.famousFor = famousFor;
	}
	
	
	
	
	
	
	

}
