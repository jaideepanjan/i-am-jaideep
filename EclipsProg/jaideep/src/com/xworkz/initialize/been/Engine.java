package com.xworkz.initialize.been;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String name;
	private String type;
	@Value("2597645659l")
	private long number;
	@Value("12.6")
	private double version;
	private String company;
	private int strokes;
	
	public Engine(@Qualifier("engineName") String name,@Qualifier("engineType") String type,@Qualifier("companyOfEngine") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	
	@Value("8")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}
	
	
	

}
