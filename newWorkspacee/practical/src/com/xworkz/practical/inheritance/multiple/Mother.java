package com.xworkz.practical.inheritance.multiple;

public interface Mother extends Family {
	
	@Override
	default void caring() {
		System.out.println("Running caring in Mother");
		Family.super.caring();
	}
	
	

}
