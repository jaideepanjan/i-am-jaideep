package com.hp.inheritance.boot;

import com.hp.inheritance.thing.WarJet;
import com.hp.inheritance.thing.childClass.Rafell;

public class WarJetRunner {

	public static void main(String[] args) {
		WarJet warJet=new WarJet();
		warJet.fly();
		warJet.fight();
		
		Rafell rafell=new Rafell();
		rafell.fly();
		rafell.fight();
		
			
		}

	}

}
