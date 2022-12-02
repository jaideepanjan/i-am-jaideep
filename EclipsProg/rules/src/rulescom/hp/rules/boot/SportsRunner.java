package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Sports;

public class SportsRunner {

	public static void main(String[] args) {
		
		Sports sports=new Sports();
		System.out.println(sports.beActive());
		System.out.println(sports.heigth());
		System.out.println(sports.practice());
		System.out.println(sports.shapr());
		System.out.println(sports.waight());
		

	}

}
