package com.xworkz.maven.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	
	@Autowired
	@Qualifier("softwareEngineearName")
	private String name;
	@Autowired
	private double salary;
	@Autowired
	private String companyName;
	@Autowired
	private int experience;
	
	
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}
	
	

}
