package com.hp.copy.boot;

import com.hp.copy.thing.Clothes;

public class ClothesRunner {

	public static void main(String[] args) {
			
			System.out.println("Accessing all details by calling the methods");
			short products=40;
			
			String[] types= {"Silk","Cotten","Polystar","Jamki",};
		    String[] colours= {"Pink","Red","Black","Purple"};
			String[] styles= {"Westren","Koorgu","Kerala", "Classic" };
			int[] sizeInNum= {30,31,32,40,100};
			String[] brands= {"Ramraj","Potees","Dmart","Trends","VanHusen"};
			char[] sizesInChar= {'M','S','X'};
			
			Clothes Clothes=new Clothes("JPK Fashion", "Price ",false,true,4.5f,types,colours, styles,sizeInNum,brands,sizesInChar);
			
			Clothes.enterDetails();
	}

}
