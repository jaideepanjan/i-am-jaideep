package com.xworkz.maven.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("typeOfPencil")
	private String type;
	@Autowired
	@Qualifier("colourOfPencil")
	private String colour;
	@Autowired
	@Qualifier("priceOfPencil")
	private float price;
	@Autowired
	@Qualifier("isPencilSharp")
	private boolean sharp;
	@Autowired
	@Qualifier("isPencilStolen")
	private boolean stolen;
	
	
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", colour=" + colour + ", price=" + price + ", sharp="
				+ sharp + ", stolen=" + stolen + "]";
	}
	
	
	
	
	

}
