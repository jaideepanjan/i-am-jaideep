package com.hp.programs.boot;
import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		long a,count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a>0)
		{
			a=a/10;
			count++;
		System.out.println("Number of Digits : "+count);

	}

}
}
