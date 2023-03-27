package com.xworkz.practical.aptiQuestions;

import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		
		
		int[] num= {1,20,3,5,7,11,13,17,28,15,14,16,12,35,49,27};
		
		int lenght=num.length;
		
		System.out.println("   No of elements in array : "+lenght);
		
		
		System.out.println("   Even numbers in Array  ");
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		
		System.out.println("   Odd numbers in array  ");
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
			}
			
		}
		
		
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%1==) {
				System.out.println("  prime numbers ");
				System.out.println(num[i]);
			}
			
		}
		
	}

}
