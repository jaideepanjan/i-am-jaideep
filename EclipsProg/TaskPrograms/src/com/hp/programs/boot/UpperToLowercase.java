package com.hp.programs.boot;

import java.util.Scanner;

public class UpperToLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any String");
		String input = sc.nextLine();
		System.out.print("String in lower case is : ");

		char[] word = input.toCharArray();
		for(int a=0;a<word.length;a++) {
			if(word[a]>='A'&& word[a]<='Z') {
				word[a]=(char)((int)word[a]+32);
				System.out.print(word[a]);
			}
		}
			sc.close();
		
	}

}
