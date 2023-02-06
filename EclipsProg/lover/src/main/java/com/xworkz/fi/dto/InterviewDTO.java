package com.xworkz.fi.dto;

import java.time.LocalDate;

public class InterviewDTO {
	
	
	private String name;
	private int age;
	private String qualification;
	private String stream;
	private short yearOfPassout;
	private String yourAddress;
	public InterviewDTO() {
System.out.println("running Dto");	}
	

	@Override
	public String toString() {
		return "InterviewDTO [name=" + name + ", age=" + age + ", qualification=" + qualification + ", stream=" + stream
				+ ", yearOfPassout=" + yearOfPassout + ", yourAddress=" + yourAddress + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public short getYearOfPassout() {
		return yearOfPassout;
	}

	public void setYearOfPassout(short yearOfPassout) {
		this.yearOfPassout = yearOfPassout;
	}

	public String getYourAddress() {
		return yourAddress;
	}

	public void setYourAddress(String yourAddress) {
		this.yourAddress = yourAddress;
	}

}
