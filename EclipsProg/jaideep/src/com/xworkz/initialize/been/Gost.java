package com.xworkz.initialize.been;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gost {
	
	@Value("Chitrangi")
	private String name;
	@Value("White")
	private String colour;
	@Value("7.4")
	private float hairLength;
	@Value("4.3")
	private float nailsLength;
	@Value("27")
	private int age;
	private LocalDate dateOfBirth;
	private LocalDate dateOfDeath;
	@Value("White")
	private String dressColour;
	@Value("Chidananda")
	private String fatherName;
	@Value("Chandramma")
	private String MotherName;
	@Value("true")
	private boolean married;
	@Value("Chitragupta")
	private String husbandName;
	private boolean childrens;
	private String fevretFood;
	private String fevretPerson;
	private String from;
	private boolean legs;
	private long mobileNo;
	private String reasionToDie;
	private boolean deathSatisfied;
	
	
	public Gost(@Qualifier("gostDateOfBirth") LocalDate dateOfBirth,@Qualifier("gostDateOfDeath") LocalDate dateOfDeath,@Qualifier("isGostHadChildrens") boolean childrens,@Qualifier("gostFevFood") String fevretFood,@Qualifier("gostFevPerson") String fevretPerson,
		@Qualifier("gostFrom")	 String from,@Qualifier("isGostHaveLegs") boolean legs,@Qualifier("gostMobileNo") long mobileNo,@Qualifier("gostReasionToDie") String reasionToDie,@Qualifier("isSatisfied") boolean deathSatisfied) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.childrens = childrens;
		this.fevretFood = fevretFood;
		this.fevretPerson = fevretPerson;
		this.from = from;
		this.legs = legs;
		this.mobileNo = mobileNo;
		this.reasionToDie = reasionToDie;
		this.deathSatisfied = deathSatisfied;
	}


	@Override
	public String toString() {
		return "Gost [name=" + name + ", colour=" + colour + ", hairLength=" + hairLength + ", nailsLength="
				+ nailsLength + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", dateOfDeath=" + dateOfDeath
				+ ", dressColour=" + dressColour + ", fatherName=" + fatherName + ", MotherName=" + MotherName
				+ ", married=" + married + ", husbandName=" + husbandName + ", childrens=" + childrens + ", fevretFood="
				+ fevretFood + ", fevretPerson=" + fevretPerson + ", from=" + from + ", legs=" + legs + ", mobileNo="
				+ mobileNo + ", reasionToDie=" + reasionToDie + ", deathSatisfied=" + deathSatisfied + "]";
	}
	
	
	
	

}
