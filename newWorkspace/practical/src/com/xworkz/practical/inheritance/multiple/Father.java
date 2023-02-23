package com.xworkz.practical.inheritance.multiple;

public interface Father extends Family {
	
	
	@Override
	default void caring() {
		System.out.println("Running caring in Father");
		Family.super.caring();
	}

}
