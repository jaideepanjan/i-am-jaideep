package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		Temple temple =new Temple();
		System.out.println(temple.dontWastFood());
		System.out.println(temple.maintainCleen());
		System.out.println(temple.maintainQ());
		System.out.println(temple.maintainSilence());
		System.out.println(temple.sanscritDress());

	}

}
