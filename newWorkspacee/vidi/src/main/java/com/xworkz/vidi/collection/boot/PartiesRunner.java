package com.xworkz.vidi.collection.boot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PartiesRunner {

	public static void main(String[] args) {

		List<String> parties = new ArrayList<>();

		parties.add("BJP");
		parties.add("JDS");
		parties.add("Aap");
		parties.add("upp");
		parties.add("Congress");

		for (String paksha : parties) {
			System.out.println(paksha);
		}
		
		System.out.println("----after conversion----");
		
		
		
		parties.stream().map(name->name.toUpperCase()).collect(Collectors.toList()).forEach(element->System.out.println(element));
		
		

	}

}
