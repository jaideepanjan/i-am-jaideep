package com.hp.programs.boot;

import java.util.Scanner;

public class Eureka {

	public static void main(String[] args) {
        
		Scanner sp = new Scanner(System.in);
		int start=sp.nextInt();
		int end=sp.nextInt();
		//System.out.println(start);
		//System.out.println(end);
		
		for(int num=start;num<=end;num++) {
			//System.out.println(num);
			int temp=num;
			System.out.println(" "+temp);
			int count=0;
			for(;temp!=0;temp=temp/10) {
				count++;
			}
			int n=temp;
			int ref=0;
			int sum=0;
			for(;n>0;n=n/10) {
				ref=n%10;
				sum+=(int)Math.pow(ref, count);
				count--;
			}
			int n=temp;
		}
		
		
	}

}
