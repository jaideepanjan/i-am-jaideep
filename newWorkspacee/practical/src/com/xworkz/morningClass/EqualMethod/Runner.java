package com.xworkz.morningClass.EqualMethod;

public class Runner {
	public static void main(String[] args) {
		
		Alcohol alcohol=new Alcohol("Signature", 12.6, "Hard", "thousandFiveHundred");
		System.out.println(alcohol);
		Alcohol alcohol2=new Alcohol("Tubourg", 10, "HArd", "FiveHundred");
		System.out.println(alcohol2);
		
		boolean equal=alcohol.equals(alcohol2);
		System.out.println("Alcojhol1 is equal to alcohol2 : "+equal);
		System.out.println("-----------------------------------------------------------");
		Fish fish=new Fish("Shark", "Gold", 2, true, 1.5);
		
		System.out.println(fish);
		
		Fish fish2=new Fish("Shark", "Gold", 2, true, 1.5);
		System.out.println(fish2);
		
		boolean equals=fish.equals(fish2);
		System.out.println("Fish 1 is equals to fish2 : "+equals);
		System.out.println("-----------------------------------------------------------");
		Fridge fridge=new Fridge("Smasung", "Silver", "Double Door", true, true, 3.5f, true, 13, 213.5, 6.7, 124545, 4, true, true);
		System.out.println(fridge);
		
		Fridge fridge2=new Fridge("LG", "Red", "Single Door", false, true, 4f, true, 14, 213.5, 6.7, 65486, 4, true, true);
		System.out.println(fridge2);
		
		boolean equals1=fridge.equals(fridge2);
		System.out.println(equals1);
		System.out.println("-----------------------------------------------------------");
		Park park=new Park("SMV", 50.80, 15, 10, false, "Garden");
		System.out.println(park);
		
		Park park2=new Park("MG", 100.80, 250, 500, true, "All round");
		System.out.println(park2);
		
		boolean equals2=park.equals(park2);
		System.out.println(equals2);
		System.out.println("-----------------------------------------------------------");
		Cake cake=new Cake("Chocolate", 2, "Circul", 1250);
		System.out.println(cake);
		Cake cake2=new Cake("Plain", 5, "Square", 280);
		System.out.println(cake2);
		
		boolean equals4=cake.equals(cake2);
		System.out.println(equals4);
				
		
		
	}

}
