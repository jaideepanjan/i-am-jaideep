package com.hp.inheritance.boot;

import com.hp.inheritance.thing.Catering;
import com.hp.inheritance.thing.childClass.BuffetCatering;

public class CateringRunner {

	public static void main(String[] args) {
		String dressCode="Catering Jacket";
		Catering catering =new Catering("SMMS", 3556545555L,dressCode, "Shivamogga City");
		catering.printMadu();
		System.out.println("----------------------------");
		
		long gstNo=1234525696L;
		BuffetCatering catering2 =new BuffetCatering("AJ",gstNo ,"Apron", "Bangalure");
		catering2.printMadu();
		
		

	}

}
