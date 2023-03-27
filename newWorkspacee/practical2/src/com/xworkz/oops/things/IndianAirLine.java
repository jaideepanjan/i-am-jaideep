package com.xworkz.oops.things;

public class IndianAirLine extends Aeroplane {
	
	public IndianAirLine() {
		System.out.println("Running no-arg in IndianAirLine");
	}
	
	@Override
	public void moveOn() {
		System.out.println("Indian air line fight flys from india to other country");
		
	}

}
