package rulescom.hp.rules.ruleMaker;

import rulescom.hp.rules.bridge.BankRules;

public class RBI {
	
	private BankRules rbiRule1;
	
	public RBI() {
		System.out.println("Running RBI rules");
	}
	
	public RBI(BankRules rbiRule1) {
		this.rbiRule1=rbiRule1;
	}
	
	public void steteBank() {
		if(this.rbiRule1!=null) {
			System.out.println("Running State bank rules");
			boolean helmet = this.rbiRule1.noHelmet();
			boolean call = this.rbiRule1.dontCallInsideBank();
			if(helmet==true&&call==true) {
				System.out.println("Account holder following the Rules");
			}
			else {
				System.out.println("Account holder not following Rules");
			}
		}
	}

}
