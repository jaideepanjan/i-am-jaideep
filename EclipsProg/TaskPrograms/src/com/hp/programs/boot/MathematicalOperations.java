package com.hp.programs.boot;
import java.util.Scanner;

public class MathematicalOperations {

	public static void main(String[] args) {
		 String txt = "Enter the two values to calculate";
		 int x;
		 int y;
			System.out.println(txt);
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x!=0&&y!=0)
		{
			
			double d1 = x+y;
			double d2 = x-y;
			double d3 = x*y;
			double d4 = x/y;
			
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(d3);
			System.out.println(d4);			
		}

	}

}
