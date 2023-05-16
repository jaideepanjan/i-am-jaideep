package com.xworkz.validation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class MarriageDTO implements Serializable, Comparable<MarriageDTO> {

	public MarriageDTO() {
		System.out.println("Running no-arg constructor");
	}

	@Min(value=1)
	@Max(value=10000)
	private int id;
	
	@Size(min=3,max=25)
	private String brideName;
	
	@Size(min=3,max=25)
	private String groomName;
	@NotEmpty
	private boolean arranged;
	
	private LocalDate marrageDate;
	
	@Size(min=3,max=25)
	private String hallName;
	
	@Min(value=50)
	@Max(value=5000)
	private int noOfPeopleInvited;
	
	@NotEmpty
	private boolean dowry;

	@Override
	public int hashCode() {
		return Objects.hash(arranged, brideName, dowry, groomName, hallName, id, marrageDate, noOfPeopleInvited);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarriageDTO other = (MarriageDTO) obj;
		return arranged == other.arranged && Objects.equals(brideName, other.brideName) && dowry == other.dowry
				&& Objects.equals(groomName, other.groomName) && Objects.equals(hallName, other.hallName)
				&& id == other.id && Objects.equals(marrageDate, other.marrageDate)
				&& noOfPeopleInvited == other.noOfPeopleInvited;
	}

	@Override
	public String toString() {
		return "MarriageDTO [id=" + id + ", brideName=" + brideName + ", groomName=" + groomName + ", arranged="
				+ arranged + ", marrageDate=" + marrageDate + ", hallName=" + hallName + ", noOfPeopleInvited="
				+ noOfPeopleInvited + ", dowry=" + dowry + "]";
	}

	public MarriageDTO(int id, String brideName, String groomName, boolean arranged, LocalDate marrageDate,
			String hallName, int noOfPeopleInvited, boolean dowry) {
		super();
		this.id = id;
		this.brideName = brideName;
		this.groomName = groomName;
		this.arranged = arranged;
		this.marrageDate = marrageDate;
		this.hallName = hallName;
		this.noOfPeopleInvited = noOfPeopleInvited;
		this.dowry = dowry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrideName() {
		return brideName;
	}

	public void setBrideName(String brideName) {
		this.brideName = brideName;
	}

	public String getGroomName() {
		return groomName;
	}

	public void setGroomName(String groomName) {
		this.groomName = groomName;
	}

	public boolean isArranged() {
		return arranged;
	}

	public void setArranged(boolean arranged) {
		this.arranged = arranged;
	}

	public LocalDate getMarrageDate() {
		return marrageDate;
	}

	public void setMarrageDate(LocalDate marrageDate) {
		this.marrageDate = marrageDate;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public int getNoOfPeopleInvited() {
		return noOfPeopleInvited;
	}

	public void setNoOfPeopleInvited(int noOfPeopleInvited) {
		this.noOfPeopleInvited = noOfPeopleInvited;
	}

	public boolean isDowry() {
		return dowry;
	}

	public void setDowry(boolean dowry) {
		this.dowry = dowry;
	}

	@Override
	public int compareTo(MarriageDTO o) {
		if (this.brideName != null) {
			return this.getBrideName().compareTo(o.getBrideName());
		}
		return 0;
	}

}
