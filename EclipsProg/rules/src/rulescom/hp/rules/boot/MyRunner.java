package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.My;

public class MyRunner {

	public static void main(String[] args) {
		
		My my=new My();
		System.out.println(my.active());
		System.out.println(my.helpingToSomone());
		System.out.println(my.honest());
		System.out.println(my.obideant());
		System.out.println(my.perfect());

	}

}
