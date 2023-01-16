package com.xworkz.exception.boot;

public class InterviewTester {

	public static void main(String[] args) {
		
		System.out.println("Main method started");

		int my[]=new int[3];
		my [0]=11;
		my [1]=20;
		my [2]=21;
		
		try {
	    my [3]=06;
		}catch(ArrayIndexOutOfBoundsException ary) {
			System.out.println("Array is out of boundary");
		}
		
		
		
		System.out.println("Starting with actual execution");
		
//		try {
//			int  str =null;
//			System.out.println(str.charAt(9));
//			System.out.println("Somthing is fishy");
//			
//		}
//		catch(ArrayIndexOutOfBoundsException ae){
//			System.out.println("");
//			
//		}
		
		
//		int i = 90;
//		int y = 0;
//		
//		
//		try {
//			String str =null;
//			System.out.println(str.charAt(9));
//			System.out.println("Somthing is fishy");
//			
//		}
//		catch(NullPointerException ae){
//			System.out.println("");
//			
//			
//		}
		System.out.println("Execution got completed");
	

	}

}
