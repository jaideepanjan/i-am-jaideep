package com.xworkz.medico.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FirstAidDTO extends AbstractAuditDTO {
	@NonNull
	@NotNull
	@Size(min = 5,max = 25,message = "the type size is not within range")
	private String type;
	
	@NonNull
	@NotNull
	@Size(min = 8,max = 30,message = "the hospitalname size is not within range")
	private String hospital;
	
	@Max(value = 9999,message = "price is not within range")
	@Min(value = 1999 ,message = "price is not within the range")
	private int price;


}
