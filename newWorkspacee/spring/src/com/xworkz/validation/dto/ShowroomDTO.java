package com.xworkz.validation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.validation.constants.Location;

public class ShowroomDTO implements Serializable,Comparable<ShowroomDTO> {
	
	private int id;
	private String name;
	private Location location;
	private int number;
	private LocalDate openDate;
	private boolean closed;

	public ShowroomDTO() {
		System.out.println("Running no arg constructor of ShowroomDTO");
	}
	
	
	@Override
	public String toString() {
		return "ShowroomDTO [id=" + id + ", name=" + name + ", location=" + location + ", number=" + number
				+ ", openDate=" + openDate + ", closed=" + closed + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(closed, id, location, name, number, openDate);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShowroomDTO other = (ShowroomDTO) obj;
		return closed == other.closed && id == other.id && location == other.location
				&& Objects.equals(name, other.name) && number == other.number
				&& Objects.equals(openDate, other.openDate);
	}



	public ShowroomDTO(int id, String name, Location location, int number, LocalDate openDate, boolean closed) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.number = number;
		this.openDate = openDate;
		this.closed = closed;
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


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public LocalDate getOpenDate() {
		return openDate;
	}


	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}


	public boolean isClosed() {
		return closed;
	}


	public void setClosed(boolean closed) {
		this.closed = closed;
	}


	@Override
	public int compareTo(ShowroomDTO o) {
		System.out.println("Running compate to method");
		if(this.name!=null) {
			return this.getName().compareTo(o.getName());
		}
		
		return 0;
	}

}
