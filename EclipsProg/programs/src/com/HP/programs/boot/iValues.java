package com.HP.programs.boot;

public class iValues {

	public static void main(String[] args) {
		System.out.println("rows");
		int n=4;
		for (int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println("");
		}

	}
	}


