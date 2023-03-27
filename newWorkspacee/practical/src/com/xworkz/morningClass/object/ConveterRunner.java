package com.xworkz.morningClass.object;

public class ConveterRunner {

	public static void main(String[] args) {
		
		System.out.println("<-----------------Sports------------------->");
		Sport sport=new Sport();
		
		int total=sport.total();
		System.out.println(total);
		
		System.out.println("<-----------------Cricket------------------->");
		
		
		Cricket cricket=new Cricket();
		
		int total2=cricket.total();
		System.out.println(total2);
		
		String coutry1=cricket.getCountry();
		System.out.println(coutry1);
		
		String coatchName=cricket.getCoatchName();
		System.out.println(coatchName);
		
		if(cricket instanceof Sport) {
			Cricket sport2=(Cricket)sport;
			System.out.println("Cricket is instance of Stpots ");
			
		}
		else{
			System.out.println("Cricket is not instance of Stpots ");		
			
		}
		Cricket sport2=(Cricket)sport;
		
		sport2.getCountry();
		sport2.getCountry();
		sport2.total();
		
		
		System.out.println("<-----------------Test Cricket------------------->");
		
		TestCricket testCricket=new TestCricket();
		
		testCricket.total();
		testCricket.getCountry();
		testCricket.getCoatchName();
		testCricket.getCaptainName();
		
		if(testCricket instanceof Sport) {
			System.out.println("testCricket instanceof Sport");
		}
		else {
			System.out.println("testCricket not instanceof Sport");
		}
		
		
		System.out.println("<-----------------ODI Cricket------------------->");
		
		
		ODICricket odiCricket=new ODICricket();
		
		odiCricket.getGroundName();
		odiCricket.getCountry();
		odiCricket.getCoatchName();
		odiCricket.total();
		
		System.out.println("<-----------------T20 Cricket------------------->");
		
		T20Cricket t20=new T20Cricket();
		
		t20.getSponsorName();
		t20.getGroundName();
		t20.getCountry();
		t20.getCoatchName();
		t20.total();
		
		
		
		
		
		
		
		
   
		
		
		

	}

}
