package com.xworkz.morningClass.inbuiltMethods.boot;

import com.xworkz.morningClass.inbuiltMethods.things.Adike;
import com.xworkz.morningClass.inbuiltMethods.things.Coconut;
import com.xworkz.morningClass.inbuiltMethods.things.Door;
import com.xworkz.morningClass.inbuiltMethods.things.Gold;
import com.xworkz.morningClass.inbuiltMethods.things.Paint;
import com.xworkz.morningClass.inbuiltMethods.things.Sugercane;

public class ThingsRunner {

	public static void main(String[] args) {

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Adike>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Adike adike1 = new Adike();

		adike1.setColor("Orange");
		adike1.setPlantName("Areka");
		adike1.setPrice(25);
		adike1.setQuantity(5);

		int hashCode1 = adike1.hashCode();
		System.out.println("HashCode : " + hashCode1);
		String toString1 = adike1.toString();
		System.out.println(toString1);

		Adike adike2 = new Adike();

		adike2.setColor("Red");
		adike2.setPlantName("Dypsis");
		adike2.setPrice(50);
		adike2.setQuantity(10);

		int hashCode2 = adike2.hashCode();
		System.out.println("HashCode : " + hashCode2);
		String toString2 = adike2.toString();
		System.out.println(toString2);

		boolean equals = adike1.equals(adike2);
		System.out.println("Adike1 Is equal to Adike2 : " + equals);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Coconut>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Coconut coconut1 = new Coconut();

		coconut1.setColour("Green");
		coconut1.setNati(true);
		coconut1.setSize(5);
		coconut1.setType("Tiptoor Coconut");

		int hashcode3 = coconut1.hashCode();
		System.out.println(hashcode3);

		String toString3 = coconut1.toString();
		System.out.println(toString3);

		Coconut coconut2 = new Coconut();

		coconut2.setColour("Brown");
		coconut2.setNati(false);
		coconut2.setSize(7);
		coconut2.setType("Mangloor Coconut");

		int hashcode4 = coconut2.hashCode();
		System.out.println(hashcode4);

		String toString4 = coconut2.toString();
		System.out.println(toString4);

		boolean equals2 = coconut1.equals(coconut2);
		System.out.println("Coconut1 is equal to coconut2 : " + equals2);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Door>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Door door1 = new Door();

		door1.setBrand("Ashirwad");
		door1.setQuality(4);
		door1.setLength(12.5);
		door1.setBreath(3.6);

		int hashcode5 = door1.hashCode();
		System.out.println(hashcode5);

		String toString5 = door1.toString();
		System.out.println(toString5);

		Door door2 = new Door();

		door2.setBrand("JP");
		door2.setQuality(5);
		door2.setLength(25.5);
		door2.setBreath(7.6);

		int hashcode6 = door2.hashCode();
		System.out.println(hashcode6);

		String toString6 = door2.toString();
		System.out.println(toString6);

		boolean isEquals = door1.equals(door2);
		System.out.println("Door1 is equal to Door2 : " + isEquals);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Gold>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Gold gold1 = new Gold();

		gold1.setColor("Orange");
		gold1.setCharter(20);
		gold1.setDensity(2.6);
		gold1.setMetal(true);

		int hashCode7 = gold1.hashCode();
		System.out.println("Hashcode : " + hashCode7);

		String toString7 = gold1.toString();
		System.out.println(" toString : " + toString7);

		Gold gold2 = new Gold();

		gold2.setColor("Brown");
		gold2.setCharter(16);
		gold2.setDensity(3.4);
		gold2.setMetal(true);

		int hashCode8 = gold2.hashCode();
		System.out.println("Hashcode : " + hashCode8);

		String toString8 = gold2.toString();
		System.out.println(" toString : " + toString8);

		boolean isEquals1 = gold1.equals(gold2);
		System.out.println("Gold1 is equal to Gold2 : " + isEquals1);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Suger Cane>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Sugercane kabbu1 = new Sugercane();

		kabbu1.setColour("Greanishyellow");
		kabbu1.setAge(6);
		kabbu1.setHeight(12.8);
		kabbu1.setFrom("Mandya");

		int hashcode9 = kabbu1.hashCode();
		System.out.println("HashCode : " + hashcode9);

		String toString9 = kabbu1.toString();
		System.out.println("ToString : " + toString9);

		Sugercane kabbu2 = new Sugercane();

		kabbu2.setColour("Brown");
		kabbu2.setAge(5);
		kabbu2.setHeight(12.4);
		kabbu2.setFrom("Shivamogga");

		int hashcode10 = kabbu2.hashCode();
		System.out.println("HashCode : " + hashcode10);

		String toString10 = kabbu2.toString();
		System.out.println("ToString : " + toString10);

		boolean isEqual = kabbu1.equals(kabbu2);
		System.out.println("Kabbu1 is equal to Kabbu2 : " + isEqual);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Paint>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		Paint banna1 = new Paint();

		banna1.setColor("Purple");
		banna1.setBrand("Nippon");
		banna1.setBrandAmbasiter("Jaideep");
		banna1.setCeo("Anjan");

		int hashCode11 = banna1.hashCode();
		System.out.println("HashCode : " + hashCode11);

		String toString11 = banna1.toString();
		System.out.println("ToString : " + toString11);

		Paint banna2 = new Paint();

		banna2.setColor("Gray");
		banna2.setBrand("Asian Painta");
		banna2.setBrandAmbasiter("Ranbeer");
		banna2.setCeo("Gottilla");

		int hashCode12 = banna2.hashCode();
		System.out.println("HashCode : " + hashCode12);

		String toString12 = banna2.toString();
		System.out.println("ToString : " + toString12);

		boolean isEqual3 = banna2.equals(banna2);
		System.out.println("Is Banna1 iiequals to Banna2 : " + isEqual3);

	}

}
