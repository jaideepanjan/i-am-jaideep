package com.hp.programs.boot;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		double x =0;
		
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();	
		
		if(x!=0)
		{
		   double	r1 = x*Math.pow(5,2);
		   double   r2 = x*Math.pow(5,3);
		   double   r3 = x*Math.pow(5,4);
		   double   r4 = x*Math.pow(5,5);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		}	

	}

}
