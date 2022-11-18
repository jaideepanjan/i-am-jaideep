package com.hp.access.boot;

import com.hp.access.things.Carpenter;
import com.hp.access.things.Lectern;

public class CarpenterRunner {

	public static void main(String[] args) {
		Carpenter carpenter=new Carpenter();
		Lectern lectern= new Lectern(4.25,1.45,false,"Quadrangl",1,true,true,false );
        
		
		System.out.println(carpenter.name);
		System.out.println(carpenter.lectern);
		System.out.println(carpenter.getMaterial());
		System.out.println(carpenter.getColour());
		System.out.println(carpenter.getTypeOfMaterial());
		
		carpenter.callLectern();
		
		
		

	}

}
