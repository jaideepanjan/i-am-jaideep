package com.xworkz.maven.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	
	@Autowired
	private long id;
	@Autowired
	@Qualifier("nameOfHardwareShop")
	private String name;
	@Autowired
	private long gstNo;
	@Autowired
	private String ownerName;
	@Autowired
	private String address;
	
	
	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	
	
	
	
	

}
