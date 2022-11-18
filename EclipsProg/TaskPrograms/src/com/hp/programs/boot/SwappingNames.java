package com.hp.programs.boot;

public class SwappingNames {

	public static void main(String[] args) {
String str1 = "Jaideep",str2 = "Puttaswamy";
		
		System.out.println("Before Swapping:"+str1+""+str2);
		
		
		str1 = str1 + str2;
		
		
		str2 = str1.substring(0,(str1.length()-str2.length()));
		
		str1 = str1.substring(str2.length());
		
		System.out.println(System.lineSeparator());
		
		
		System.out.println("After swapping the String:"+str1+""+str2);

	}

}
