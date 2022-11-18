package com.hp.inheritance.boot;

import com.hp.inheritance.thing.Marrage;
import com.hp.inheritance.thing.childClass.LoveComeArrangeMarrage;

public class MarrageRunner {

	public static void main(String[] args) {
		String venu="Basaveswara Convention Hall";
		Marrage marrage =new Marrage("Indian", 2578,true, venu);
		marrage.printMadu();
		System.out.println("----------------------------");
		
		int members=1254;
		LoveComeArrangeMarrage marrage2 =new LoveComeArrangeMarrage("Crischean Style",members ,false, "Manjunatha Kalyana Mantapa");
		marrage2.printMadu();

	}

}
