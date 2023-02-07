package com.xwork.amul.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BeverageDTO {
	
	private String name;
	private String brand;
	private int id;
	private LocalDate mnufDate;
	private LocalDate expDate;
	private String type;
	private String madeIn;
	private double quantity;
	private double price;
	

}
