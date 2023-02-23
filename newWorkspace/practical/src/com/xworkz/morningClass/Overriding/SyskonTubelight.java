package com.xworkz.morningClass.Overriding;

public class SyskonTubelight extends Tubelight {
	
	public SyskonTubelight() {
		System.out.println("Running no-arg cons in SyskonTubelight");
	}
	
	@Override
	public String colour() {
		System.out.println("Syskon tubelightb colour is : ");
		return "White";
	}

}
