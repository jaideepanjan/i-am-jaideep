package com.xworkz.boot;

import com.xworkz.concepts.things.Place;

public class PlaceRunner {

	public static void main(String[] args) {

		Place place=new Place("Bengaluru", 2190);
		
		
		Place place2=new Place("Tumkur", 70);
		
		//place2=this
		//place=arg
		System.out.println(place2.equals(place));
		
		
		Place place3=new Place("Tumkur", 70);
		
		
		System.out.println(place2.equals(place3));
		
		
		
		
	}

}
