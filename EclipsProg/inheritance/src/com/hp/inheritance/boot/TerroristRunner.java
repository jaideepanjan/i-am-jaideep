package com.hp.inheritance.boot;

import com.hp.inheritance.thing.Terrorist;
import com.hp.inheritance.thing.childClass.Kasab;

public class TerroristRunner {

	public static void main(String[] args) {
		
		Terrorist terrorist=new Terrorist();
		terrorist.fullName();
		terrorist.nickName();
		
		Kasab kasab=new Kasab("Rasudulla Khan", "Killing people", "Pakistan", "Brown");
		kasab.fullName();
		kasab.nickName();

	}

}
