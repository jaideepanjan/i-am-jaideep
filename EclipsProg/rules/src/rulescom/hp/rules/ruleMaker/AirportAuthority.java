package rulescom.hp.rules.ruleMaker;

import rulescom.hp.rules.bridge.AirportRule;

public class AirportAuthority {
	
	private AirportRule staf;
	
	public AirportAuthority() {
		System.out.println("Running default constructer of Airport Authority");
	}
	
	public AirportAuthority(AirportRule staf) {
		this.staf=staf;
	}
	
	public void stafRules() {
		System.out.println("Running Staf Rules");
		if(this.staf!=null) {
			boolean id = this.staf.idCard();
			boolean uni =this.staf.uniform();
			if(id==true&&uni==true) {
				System.out.println("Staf following Authority Rules");
			}
			else {
				System.out.println("Staf not following Authority Rules");
			}
		}
			
	}

}
