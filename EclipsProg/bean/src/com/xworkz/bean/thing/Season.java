package com.xworkz.bean.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private String startingMonth;
	private int duration;
	
	public Season() {
		System.out.println("Running default constructer of Season");
		
	}
	
	public String getName() {
		return name;
	}
	
	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}
	
	 @Value("November")
     public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	 
	 public int getDuration() {
		return duration;
	}
	 
	 @Value("3")
	 public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
