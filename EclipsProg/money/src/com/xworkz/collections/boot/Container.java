package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

public class Container {

	public static void main(String[] args) {

		Collection<String> ourNation = new ArrayList<>();

		String nationalAnthem = "Jana Gana Mana";
		ourNation.add("National Anthem : " + nationalAnthem);

		String nFC = "Tricolour";
		ourNation.add("National flag name : " + nFC);

		String nationalBird = "Peacock";
		ourNation.add("National Bird : " + nationalBird);

		String nA = "Tiger";
		ourNation.add("National Animal" + nA);

		String foN = "Mahatma Gandi";
		ourNation.add("Father of our Nation : " + foN);

		String coN = "New Delhi";
		ourNation.add("Capital of our Nation : " + coN);

		String president = "Tiger";
		ourNation.add("President of our Nation : " + president);

		String philosophy = "Atithi Devo Bhava";
		ourNation.add("National Philosophy : " + philosophy);

		System.out.println(ourNation);

		System.out.println("------------------------------------------------");

		Collection<Integer> numberOfAnimalsInIndia = new ArrayList<>();

		System.out.println("Number Of Animals In India ");

		Integer tiger = 3002;
		System.out.println("Tigers : ");
		numberOfAnimalsInIndia.add(tiger);

		Integer lions = 1200;
		System.out.println("Lions : ");

		numberOfAnimalsInIndia.add(lions);

		Integer elephants = 27875;
		numberOfAnimalsInIndia.add(elephants);

		Integer leopards = 9593;
		numberOfAnimalsInIndia.add(tiger);

		Integer asiaticLions = 674;
		numberOfAnimalsInIndia.add(asiaticLions);

		System.out.println(numberOfAnimalsInIndia);
	}

}
