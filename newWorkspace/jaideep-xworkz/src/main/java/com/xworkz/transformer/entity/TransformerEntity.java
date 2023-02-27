package com.xworkz.transformer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="java_tables.transformer_table")
public class TransformerEntity {
	
	
	
	@Id
	@Column(name="t_id")
	private int id;
	
	@Column(name="t_type")
	private String type;
	
	@Column(name="t_phase")
	private Integer phase;
	
	@Column(name="t_qualirtStandards")
	private String qualityStandards;
	
	@Column(name="t_coilType")
	private String coilType;
	
	@Column(name="t_kva")
	private Integer kva;
	
	@Column(name="t_weight")
	private Double weight;
	
	@Column(name="t_typeOfCooling")
	private String typeOfCooling;
	
	@Column(name="t_cost")
	private Double cost;
	
	

}
