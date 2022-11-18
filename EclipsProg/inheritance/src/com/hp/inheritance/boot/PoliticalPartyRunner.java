package com.hp.inheritance.boot;

import com.hp.inheritance.thing.PoliticalParty;
import com.hp.inheritance.thing.childClass.BJP;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		
		PoliticalParty politicalParty=new BJP("Bharatiya Janata Party",76, "Lotus/Kamala","Jagdeesh");
		politicalParty.printMadu();
		
		BJP bjp=new BJP("Komgress",56, "Hasta","Jaideep");
		bjp.printMadu();
		
		
				

	}

}
