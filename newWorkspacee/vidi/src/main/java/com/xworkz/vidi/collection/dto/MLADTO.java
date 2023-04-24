package com.xworkz.vidi.collection.dto;

import java.io.Serializable;
import java.util.Objects;

public class MLADTO implements Serializable {
	
	
	private String name;
	private Integer  age;
	private String constituency;
	private String party;
	private boolean independent;
	private String gender;
	
	public MLADTO() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, constituency, gender, independent, name, party);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MLADTO other = (MLADTO) obj;
		return age == other.age && Objects.equals(constituency, other.constituency)
				&& Objects.equals(gender, other.gender) && independent == other.independent
				&& Objects.equals(name, other.name) && Objects.equals(party, other.party);
	}

	public MLADTO(String name, int age, String constituency, String party, boolean independent, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.constituency = constituency;
		this.party = party;
		this.independent = independent;
		this.gender = gender;
	}
	
	

	@Override
	public String toString() {
		return "MLADTO [name=" + name + ", age=" + age + ", constituency=" + constituency + ", party=" + party
				+ ", independent=" + independent + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public boolean isIndependent() {
		return independent;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
