package com.xworkz.morningClass.Overriding;

public class Clock {
	
	public Clock() {
		System.out.println("Running no-arg cons ");
	}
	
	public double cost() {
		System.out.println("Cost ofthe clocks depends on brand and designes");
		return 12560;
	}
	
	public int warrenty() {
		System.out.println("warrenty of the watch");
		return warrenty();
	}

}
