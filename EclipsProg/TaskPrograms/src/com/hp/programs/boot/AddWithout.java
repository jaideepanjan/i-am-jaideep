package com.hp.programs.boot;
import java.util.Scanner;

public class AddWithout {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		
		Scanner sc= new Scanner(System.in);
		 a=sc.nextInt();
		  b=sc.nextInt();
		
		for(int i=0;i<b;i++)
		{
			a++;//a+1
		}
		
		System.out.print(a);
	}

}
