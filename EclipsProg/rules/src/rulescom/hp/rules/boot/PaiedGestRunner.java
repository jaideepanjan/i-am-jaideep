package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.PaiedGest;

public class PaiedGestRunner {

	public static void main(String[] args) {
		
		PaiedGest paiedGest=new PaiedGest();
		System.out.println(paiedGest.dontMakeNoice());
		System.out.println(paiedGest.dontWastFood());
		System.out.println(paiedGest.maintainCleen());
		System.out.println(paiedGest.outersNotAllowed());
		System.out.println(paiedGest.payCarrectly());
		

	}

}
