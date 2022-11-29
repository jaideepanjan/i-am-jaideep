package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Dady;
import rulescom.hp.rules.followers.DadyRules;

public class DadyRunner {

	public static void main(String[] args) {
		
		Dady dady=new Dady();
		
		System.out.println(dady.beingRight());
		System.out.println(dady.responcibality());
		System.out.println(dady.spendingMoney());
		System.out.println(dady.studyWell());
		System.out.println(dady.wakeupEarly(0));
		

	}

}
