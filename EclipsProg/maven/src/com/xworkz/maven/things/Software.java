package com.xworkz.maven.things;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Software {
	
	@Autowired
	@Qualifier("softwareName")
	private String name;
	@Autowired
	private float version;
	@Autowired
	private String devloper;
	@Autowired
	private LocalDate date;
	@Autowired
	private boolean free;
	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", devloper=" + devloper + ", date=" + date
				+ ", free=" + free + "]";
	}
	
	
	
	
	
	
	
	
	

}
