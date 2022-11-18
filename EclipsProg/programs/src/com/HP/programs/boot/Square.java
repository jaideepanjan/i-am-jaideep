package com.HP.programs.boot;

public class Square {

	public static void main(String[] args) {
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print("$");
			}
			System.out.println(" ");
		}
		System.out.println("-------------");
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
			System.out.print(i);
			}
			System.out.println(" ");
		}
		System.out.println("----------");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==3)
			System.out.print("AJ");
			}
			System.out.println(i);
		}
		System.out.println("------------");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==3)
			System.out.print(j);
			}
			System.out.println("AJ");
		}
		System.out.println("_________________");
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2) {
			System.out.print(" Jaideep ");
			
			
				}
			else {
				System.out.print(i);
			}
			
			System.out.println();
			
		}
		}
		}
		
		
		

	}


