package com.xworkz.transformer.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class TransformerDTO {
	
	
	@NotNull(message="Type can not be null")
	@Size(min=3,max=20,message="type should be more than 3 and less than 20 charecter")
	private String type;
	
	@NotNull(message="Type can not be null")
	@Min(value=1,message="Phase must 1 or 3 only")
	@Max(value=3,message="Phase must 1 or 3 only")
	private Integer phases;
	
	@NotNull(message="Quality Standards can not be null")
	private String qualityStandards;
	
	@NotNull(message="Coil Type can not be null")
	@Size(min=3,max=20,message="type should be more than 3 and less than 20 charecter")
	private String coilType;
	
	@NotNull(message="Type can not be null")
	@Min(value=(long) 0.75,message="Phase must more than 0.75 less than 250 only")
	@Max(value=250,message="Phase must more than 0.75 less than 250 only")
	private Integer kva;
	
	@NotNull(message="Weight can not be null")
	private double weight;
	
	@NotNull(message="Type Of Cooling can not be null")
	@Size(min=3,max=20,message="type should be more than 3 and less than 20 charecter")
	private String typeOfCooling;
	
	@NotNull(message="Cost can not be null")
	private double cost;
	
	
	
	

}
