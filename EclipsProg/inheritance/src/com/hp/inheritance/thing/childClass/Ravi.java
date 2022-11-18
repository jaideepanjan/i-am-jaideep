package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.Criminal;

public class Ravi extends Criminal {
	public int height;
	
	public Ravi() {
		} 
	
	
	public Ravi(String type, int age, boolean realyCriminal,int height) {
		super(type,age, realyCriminal);
		this.height=height;
	}
	public void printMadu() {
		super.printMadu();
		System.out.println(this.height);
	}

}
