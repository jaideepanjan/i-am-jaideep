package com.xworkz.muddu.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="egg.egg_details")

public class EggAppDTO {
	
	@Id
	@Column(name="egg_id")
	private int id;
	@Column(name="egg_hotelName")
	private String hotelName;
	@Column(name="egg_type")
	private String eggType;
	@Column(name="egg_type")
	private String eggDishName;
	@Column(name="egg_dishName")
	private double price;
	@Column(name="egg_price")
	private int quantity;
	@Column(name="egg_quantity")
	private String takeAway;

}
