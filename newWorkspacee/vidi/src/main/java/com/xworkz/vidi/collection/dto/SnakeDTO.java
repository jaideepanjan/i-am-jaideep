package com.xworkz.vidi.collection.dto;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

import javax.persistence.EnumType;

import com.xworkz.vidi.collection.constants.SnakeType;

public class SnakeDTO implements Serializable,Comparator<SnakeDTO>  {
	
	public SnakeDTO() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	private Integer id;
	private String name;
	private SnakeType type;
	private String place;
	
	@Override
	public String toString() {
		return "SnakeDTO [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, place, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnakeDTO other = (SnakeDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(place, other.place)
				&& type == other.type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SnakeType getType() {
		return type;
	}

	public void setType(SnakeType type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public int compare(SnakeDTO o1, SnakeDTO o2) {
		System.out.println(" Running compare method ");
		
		
		return 0;
	}
	
	
	
	
	
	
	

}
