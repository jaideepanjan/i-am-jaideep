package com.xworkz.morningClass.object;

public class TestCricket extends Cricket {
	
	private String captainName;
	
	public TestCricket() {
		System.out.println("Running no-arg cons in TestCricket");
	}
	
	public TestCricket(String captainName) {
		System.out.println("Running no-arg cons in TestCricket");
	}
	public String getCaptainName() {
		return "Virat Kohli";
	}
	
	

}
