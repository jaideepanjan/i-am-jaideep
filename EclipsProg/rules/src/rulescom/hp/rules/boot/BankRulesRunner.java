package rulescom.hp.rules.boot;

import rulescom.hp.rules.followers.AccountHolder;
import rulescom.hp.rules.ruleMaker.RBI;

public class BankRulesRunner {

	public static void main(String[] args) {
           
		AccountHolder accountHolder=new AccountHolder();
		
		RBI rbi=new RBI(accountHolder);
		rbi.steteBank();
		
	}

}
