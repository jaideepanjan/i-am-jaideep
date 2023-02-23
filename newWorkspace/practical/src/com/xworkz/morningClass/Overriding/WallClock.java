package com.xworkz.morningClass.Overriding;

public class WallClock extends Clock{
	
	public WallClock() {
		System.out.println("Running no-arg cons in Wallclock");
	}

	
	@Override
	public double cost() {
		System.out.println("Cost of Wall clock is : ");
		return 850;
	}
}
