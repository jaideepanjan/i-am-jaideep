package com.hp.inheritance.boot;

import com.hp.inheritance.thing.HumanResourse1;
import com.hp.inheritance.thing.childClass.Akashara;

public class HumanResourceRunner {

	public static void main(String[] args) {
		
		HumanResourse1 humanResourse1=new HumanResourse1();
		humanResourse1.responsibility();
		humanResourse1.power();
		
		Akashara akashara=new Akashara("Akashara", "Degree", "Shivamogga", "X-Workz");
		akashara.responsibility();
		akashara.power();

	}

}
