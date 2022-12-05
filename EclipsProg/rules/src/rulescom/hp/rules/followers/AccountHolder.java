package rulescom.hp.rules.followers;

import rulescom.hp.rules.bridge.BankRules;

public class AccountHolder implements BankRules {

	@Override
	public boolean noHelmet() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean dontCallInsideBank() {
		// TODO Auto-generated method stub
		return true;
	}

}
