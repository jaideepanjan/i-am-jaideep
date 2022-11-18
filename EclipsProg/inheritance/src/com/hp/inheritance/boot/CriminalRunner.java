package com.hp.inheritance.boot;

import com.hp.inheritance.thing.Criminal;
import com.hp.inheritance.thing.childClass.Ravi;

public class CriminalRunner {

	public static void main(String[] args) {
		Criminal criminal=new Criminal("Chain Snacher", 25, true);
		criminal.printMadu();
		
		
		
		Ravi ravi=new Ravi("Theafe", 36, true,6);
		ravi.printMadu();


	}

}
