package rulescom.hp.rules.ruleMaker;

import rulescom.hp.rules.bridge.BmrclRules;

public class BmrclManagent {

	private BmrclRules bmrclRule1;
	
	public BmrclManagent() {
		System.out.println("Running the Librarian default constructer");
	}
	
	public BmrclManagent(BmrclRules bmrclRule1) {
		this.bmrclRule1=bmrclRule1;		
	}
	
	public void passengersRules() {
		if(this.bmrclRule1!=null) {
			System.out.println("Running BMRCL Passengers Rules");
			boolean issue = this.bmrclRule1.beReadyWithAmount();
			boolean scilence = this.bmrclRule1.wearMask();
			if(issue==true&&scilence==true) {
				System.out.println("Readers following the Rules");
			}
			else {
				System.out.println("Readers not following Rules");
			}
		}
	}

}
