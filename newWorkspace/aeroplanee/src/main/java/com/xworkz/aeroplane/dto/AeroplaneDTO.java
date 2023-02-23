package com.xworkz.aeroplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AeroplaneDTO {
	@Size(min = 3, max = 20, message = "Aeroplane  company name should be more than 3 and less than 20")
	private String company;
	@Size(min = 3, max = 20, message = "Aeroplane name should be more than 3 and less than 20")
	private String name;
	private double cost;
	@NotBlank(message = "type should be selectd")
	private String type;
	@NotBlank(message = "country should be selectd")
	private String country;
	private int id;

}
