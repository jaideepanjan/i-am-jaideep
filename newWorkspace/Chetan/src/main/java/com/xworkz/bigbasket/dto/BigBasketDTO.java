package com.xworkz.bigbasket.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BigBasketDTO {
	
	@Size(min = 3, max = 20, message = "BigBasket name should be more than 3 and less than 20")
	private String name;
	private Double phoneNumber;
		private String email;
	private Double noOfWorkers;
	private Boolean cod;
	private Boolean delivery;
	@Size(min = 8, max = 8, message = "BigBasket password should be more than 3 and less than 20")
	private String passWord;
	@Size(min = 3, max = 20, message = "BigBasket storelocation should be more than 3 and less than 20")
	private String storeLocation;
	@NotBlank(message = "area should be selectd")
	private String areas;
	@NotBlank(message = "items should be selectd")
	private String items;

}
