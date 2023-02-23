package com.xworkz.morningClass.EqualMethod;

import java.time.LocalDate;

public class ChiefMinister {

	private String name;
	private String party;
	private boolean educated;
	private String qualification;
	private int yearOfService;
	private int salery;
	private String cmCarName;
	private int age;
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoin;
	private String city;
	private String stateName;
	private boolean citygenOfIndia;

	public ChiefMinister() {
		System.out.println("Running no arg cons of ChiefMinister");
	}

	public ChiefMinister(String name, String party, boolean educated, String qualification, int yearOfService,
			int salery, String cmCarName, int age, LocalDate dateOfBirth, LocalDate dateOfJoin, String city,
			String stateName, boolean citygenOfIndia) {

		this.name = name;
		this.party = party;
		this.educated = educated;
		this.qualification = qualification;
		this.yearOfService = yearOfService;
		this.salery = salery;
		this.cmCarName = cmCarName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoin = dateOfJoin;
		this.city = city;
		this.stateName = stateName;
		this.citygenOfIndia = citygenOfIndia;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in ChiefMinister");
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof ChiefMinister) {
				System.out.println("Object is instance of ChiefMinister can compare");
				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister chiefMinister = this;
				ChiefMinister chiefMinister2 = casted;
				if (chiefMinister.name.equals(chiefMinister2.name) && chiefMinister.party.equals(chiefMinister2.party)
						&& chiefMinister.educated == chiefMinister2.educated
						&& chiefMinister.yearOfService == chiefMinister2.yearOfService
						&& chiefMinister.salery == chiefMinister2.salery
						&& chiefMinister.cmCarName.equals(chiefMinister2.cmCarName)
						&& chiefMinister.age == chiefMinister2.age
						&& chiefMinister.dateOfBirth == chiefMinister.dateOfBirth
						&& chiefMinister.dateOfJoin == chiefMinister2.dateOfJoin
						&& chiefMinister.city.equals(chiefMinister2.city)
						&& chiefMinister.stateName.equals(chiefMinister2.stateName)
						&& chiefMinister.citygenOfIndia == chiefMinister2.citygenOfIndia) {
					System.out.println("ChiefMinister1 and Chiefminister2 both are same");
					return true;
				} else {
					System.out.println("ChiefMinister1 and Chiefminister2 both are not same");
				}

			} else {
				System.out.println("Object is not instance of ChiefMinister can't compare");
			}
		} else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "ChiefMinister [name=" + name + ", party=" + party + ", educated=" + educated + ", qualification="
				+ qualification + ", yearOfService=" + yearOfService + ", salery=" + salery + ", cmCarName=" + cmCarName
				+ ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", dateOfJoin=" + dateOfJoin + ", city=" + city
				+ ", stateName=" + stateName + ", citygenOfIndia=" + citygenOfIndia + "]";
	}

}
