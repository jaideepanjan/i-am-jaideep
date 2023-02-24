package com.xworkz.forest.dto;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ForestDTO {
	
	private int id;
	@Size(min = 3, max = 20, message = "Forest name should be more than 3 and less than 20")
	private String name;
	@Size(min = 3, max = 20, message = "State should be more than 3 and less than 20")
	private String state;
	private double area;
	@Size(min = 3, max = 20, message = "Type name should be more than 3 and less than 20")
	private String type;
}
