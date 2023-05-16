package com.xworkz.validation.dto;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.validation.constants.Cells;

public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {

	
	private int id;
	private String name;
	private String inspectorName;
	private Cells noOfCells;
	private String area;

	public PoliceStationDTO() {
		System.out.println("Running no arg constructor of policeStetion dto");
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, id, inspectorName, name, noOfCells);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliceStationDTO other = (PoliceStationDTO) obj;
		return Objects.equals(area, other.area) && id == other.id && Objects.equals(inspectorName, other.inspectorName)
				&& Objects.equals(name, other.name) && noOfCells == other.noOfCells;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [id=" + id + ", name=" + name + ", inspectorName=" + inspectorName + ", noOfCells="
				+ noOfCells + ", area=" + area + "]";
	}

	public PoliceStationDTO(int id, String name, String inspectorName, Cells noOfCells, String area) {
		super();
		this.id = id;
		this.name = name;
		this.inspectorName = inspectorName;
		this.noOfCells = noOfCells;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInspectorName() {
		return inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}

	public Cells getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(Cells noOfCells) {
		this.noOfCells = noOfCells;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public int compareTo(PoliceStationDTO o) {
		System.out.println("Running compareTo methos in PoliceStation DTO");
		if (this.getName() != null) {
			return this.getName().compareTo(o.getName());
		}
		return 0;
	}

}
