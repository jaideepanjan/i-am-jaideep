package com.hp.programs.boot;

import java.util.Scanner;

public class Count_and_Remove {
	
	public static void main(String[] args) {
		
		
		String str="A day without joy the day completly wasted";
		String s[]=str.split("");
		Scanner sp=new Scanner(System.in);
		String rev=sp.next();
		
		String name="";
		
		for(int i=0; i<s.length; i++) {
			if(s[i]==rev) {
				
		}
		
		int count=0;
		String s1="";
		for(char ch:str.toCharArray()) {
			if(ch==' ') {
				//count+=1;
				count=count+1;
			}
			else {
				s1+=ch;
			}
		}
		System.out.println("White spaces : "+count);
		
		
	
		}
		
	}
	

}
