package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findByName", query = "select entity from ForestEntity entity where entity.name='Bandipura National Forest'")
@NamedQuery(name = "findByState", query = "select entity from ForestEntity entity where entity.state='Kerala'")
@NamedQuery(name = "findByNameAndStateAndArea", query = "select entity from ForestEntity entity where entity.name='Kanha Tiger Reserve'and entity.state ='Madhya Pradesh'and entity.area='940'")
@NamedQuery(name = "findAreaByName", query = "select entity.area from ForestEntity entity where entity.name='Kaziranga National Park'")
@NamedQuery(name = "findIdByNameAndState", query = "select entity from ForestEntity entity where entity.id='7'and entity.state ='Kerala'and entity.name='Periyar National Park'")
@NamedQuery(name = "findNameById", query = "select entity.name from ForestEntity entity where entity.id='4'")
@NamedQuery(name = "findStateByNameAndArea", query = "select entity.state from ForestEntity entity where entity.name='Kaziranga National Park'and entity.area='16'")
@NamedQuery(name = "findCount", query = "select count (entity) from ForestEntity entity ")
@NamedQuery(name = "findMax", query = "select max(entity.area) from ForestEntity entity")
@Table(name = "forest_details")
public class ForestEntity {
	@Id
	@Column(name = "forest_id")
	private int id;
	@Column(name = "forest_name")
	private String name;
	@Column(name = "forest_state")
	private String state;
	@Column(name = "forest_area")
	private double area;
	@Column(name = "forest_type")
	private String type;

}
