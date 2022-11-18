package com.hp.inheritance.thing.childClass;

import com.hp.inheritance.thing.Catering;

public class BuffetCatering extends Catering {
	
	public BuffetCatering() {
		
	}
	
	public BuffetCatering(String name, long gstNo, String dressCode, String officLocation) {
		super ( name, gstNo,  dressCode, officLocation);
	}
	
	public void showMadu() {
		System.out.println(name);
		System.out.println(gstNo);
		System.out.println(dressCode);
		System.out.println(officLocation);
	}

}
