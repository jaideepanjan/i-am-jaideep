package com.HP.programs.boot;

import sun.security.util.Length;

public class Array {

	public static void main(String[] args) {
		
		String names[]= {"Jaideep","Jagadeesh","Harshitha","Prashanth","Rudresh"};
		
		System.out.println(names[1]);
		
		int name=names.length;
		System.out.println("Lenght of aray  : " +name);
		for(int i=0;i<=names.length;i++) {
			System.out.println(names[i]);
			
		}
		
		

	}

}
