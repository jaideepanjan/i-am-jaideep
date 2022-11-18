package com.hp.programs.boot;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int a=0;
		System.out.println("Enter Number to check odd or even");
		System.out.println("---------------------------------");
		Scanner sc= new Scanner(System.in);
		 a=sc.nextInt();
		 
		
		if(a%2==0)
		{
			System.out.print("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		
	}
		

}