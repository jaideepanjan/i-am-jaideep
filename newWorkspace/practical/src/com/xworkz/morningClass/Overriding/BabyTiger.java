package com.xworkz.morningClass.Overriding;

public class BabyTiger extends Tiger{
	
	
	public BabyTiger() {
		System.out.println("Running no-arg cons in Baby tiger");
	}
	
	@Override
	public String name() {
		System.out.println("Name of baby tiger is :");
		return "Charan";
	}

}
