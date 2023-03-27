package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="forest_table")
@NamedQuery(name="findByNmae", query = "")
@NamedQuery(name="findByState", query = "")
@NamedQuery(name="findByNameAndStateAndArea", query = "")
@NamedQuery(name="findAreaByName", query = "")
@NamedQuery(name="findIdByNmaeAndState", query = "")
@NamedQuery(name="findNmaeById", query = "")
@NamedQuery(name="findStateByNmaeAndArea", query = "")
@NamedQuery(name="findCount", query = "")
@NamedQuery(name="findMaxArea", query = "")
public class ForestEntity {
	
	@Id
	@Column(name="f_id")
	private int id;
	@Column(name="f_name")
	private String name;
	@Column(name="f_state")
	private String state;
	@Column(name="f_area")
	private double area;
	@Column(name="f_type")
	private String type;

}
