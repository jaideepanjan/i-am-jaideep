package com.xworkz.boot;

import com.xworkz.concepts.things.Heater;

public class HeaterRunner {

	public static void main(String[] args) {

		Heater heater=new Heater("Bajaj", "Copper", 1200);
		System.out.println(heater);
		
		
		Heater heater2=new Heater("Philips","Copper",1300);
		System.out.println(heater2);
		//System.out.println(heater==heater2);
		//heater=this
		//heater2=obj
		boolean equal=heater.equals(heater2);//addrerss
		System.out.println("Heater and Heater 2 is same :"+equal);
		
		Heater heater3=new Heater("Philips","Copper",1300);
		
		System.out.println(heater.equals(heater3));//
		//heater2=this
		//heater3=obj
		System.out.println(heater2.equals(heater3));//true
		
		
	}

}
