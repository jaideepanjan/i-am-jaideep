package com.HP.programs.boot;

public class RevTrai {

	public static void main(String[] args) {
		int n=4;
		for (int i=n;i>=1;i--) {
			for(int j=n-1;j>=i;j--) {				
					System.out.print(" ");
				}
			for(int k=1;k<=i;k++) {
					System.out.print(" &");
				
				
			}
			System.out.println("");
		}
		}
	}


