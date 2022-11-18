package com.hp.inheritance.thing.childClass;
import com.hp.inheritance.thing.Marrage;

public class LoveComeArrangeMarrage extends Marrage  {
	public LoveComeArrangeMarrage() {
		
	}
	
	public LoveComeArrangeMarrage(String style, int members, boolean registration, String venu) {
		super ( style, members,  registration, venu);
	}
	
	public void showMadu() {
		System.out.println(style);
		System.out.println(members);
		System.out.println(registration);
		System.out.println(venu);
	}

}
