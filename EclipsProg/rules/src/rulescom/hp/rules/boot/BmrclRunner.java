package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.BmrclRules;
import rulescom.hp.rules.followers.BMRCLPassengers;
import rulescom.hp.rules.ruleMaker.BmrclManagent;


public class BmrclRunner {

	public static void main(String[] args) {		

		BMRCLPassengers bmrclPassengers=new BMRCLPassengers();
		
		BmrclManagent bmrclManagent=new BmrclManagent(bmrclPassengers);
		bmrclManagent.passengersRules();

	}

}
