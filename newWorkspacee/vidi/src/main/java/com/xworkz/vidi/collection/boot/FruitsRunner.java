package com.xworkz.vidi.collection.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitsRunner {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("Greaps");
		fruits.add("Lemeon");
		fruits.add("Pappaya");
		fruits.add("Dragon");
		fruits.add("Orange");
		fruits.add("Gova");
		fruits.add("Muskmelon");
		fruits.add("Pomogranet");
		fruits.add("Apple");
		fruits.add("Cheeku");
		fruits.add("Strabery");
		fruits.add("Banana");
		fruits.add("Pineapple");
		fruits.add("Watermelon");
		fruits.add("Cherry");
		fruits.add("Kiwi");
		fruits.add("Mangosteen");
		fruits.add("Avocados");
		fruits.add("Blueberry");
		fruits.add("Jackfruit");
		fruits.add("Tamrind");
		fruits.add("Gooseberry");
		fruits.add("Custard Apple");
		fruits.add("Curry berry");
		fruits.add("Pear");
		fruits.add("Lychee");
		fruits.add("Apricot");
		fruits.add("Fig");
		fruits.add("Persimmon");
		fruits.add("Mulberry");
		fruits.add("Star fruite");
		fruits.add("Granny Smith Apple");

		for (String hannu : fruits) {
			System.out.println(hannu);
		}
		
		System.out.println("---Upper case---");
		
		fruits.stream().map(pala->pala.toUpperCase()).collect(Collectors.toList()).forEach(pal->System.out.println(pal));

		System.out.println("---Fruit Length is less than 5---");
		
		fruits.stream().filter(sara->sara.length()<5).collect(Collectors.toList()).forEach(palagalu->System.out.println(palagalu));
		
		System.out.println("---Fruit Length is greater than 5 and less than 10---");
		
		fruits.stream().filter(sara->sara.length()>5&&sara.length()<10).collect(Collectors.toList()).forEach(palagalu->System.out.println(palagalu));
	
		System.out.println("---Fruit Length is greater than 10 lesser 15---");

		fruits.stream().filter(sara->sara.length()>10&&sara.length()<15).collect(Collectors.toList()).forEach(palagalu->System.out.println(palagalu));

	
	}

}
