package com.xworkz.bigbasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="big_basket_table")

public class BigBasketEntity {
	
	@Id
	@Column(name = "B_id")
	private int id;
	@Column(name = "B_Name")
	private String name;
	@Column(name = "B_Phone_Number")
	private Double phoneNumber;
	@Column(name = "B_Email")
	private String email;
	@Column(name = "B_Noofworkers")
	private Double noOfWorkers;
	@Column(name = "B_Cod")
	private Boolean cod;
	@Column(name = "B_Delivery")
	private Boolean delivery;
	@Column(name = "B_Password")
	private String passWord;
	@Column(name = "B_StoreLocation")
	private String storeLocation;
	@Column(name = "B_Area")
	private String areas;
	@Column(name = "B_Item")
	private String items;

}
