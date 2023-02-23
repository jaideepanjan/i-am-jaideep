package com.xworkz.practical.string;

public class StringClass {
	
	
	
	public static void main(String[] args) {
	
	
	String s1=new String("amul");
	
	String s2="anjan";
	String s3="jaideep";
	
	if(s3==s2) {
		System.out.println(s2+" Equals to "+s3);
	}
	
	else {
		System.out.println(s2+" is not Equals to "+s3);
	}
	
	boolean s4=s2.equals(s3);
	System.out.println(s4);
	
	String s5=s1.toUpperCase();
	System.out.println(s5);
	
	String s6=s5.toLowerCase();
	System.out.println(s6);
	
	int s7=s2.length();
	System.out.println(s7);
	
	int s8=s2.compareTo(s3);
	
	
	if(s8==0) {
	System.out.println(s2+" is equal to "+s3);
	}
	else if(s8>0) {
		System.out.println(s2+" is greater than "+s3);
	}
	else {
		System.out.println(s2+" is lesser than "+s3);
	}	
	
	
	}
	
}
