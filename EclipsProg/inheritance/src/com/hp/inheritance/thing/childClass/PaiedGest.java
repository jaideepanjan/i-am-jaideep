package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.Home;

public class PaiedGest extends Home {
	
	public String booking;
	
	public  Home(int members, String type, boolean duplex,String booking) {
		super(members,type,duplex);
		this.booking=booking;
	}
	
	@Override
	
	public void jointFamily() {
		super.jointFamily();
		System.out.println("To book the bed : "+booking);
		System.out.println("----------------------------------");
	}
	
	public void SeparateFamily() {
		super.SeparateFamily();
		System.out.println("Paid gest like Joint Fmaily not Seperate Family");
	}
	

}
