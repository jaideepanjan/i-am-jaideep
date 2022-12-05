package rulescom.hp.rules.boot;

import rulescom.hp.rules.followers.AirportStaf;
import rulescom.hp.rules.ruleMaker.AirportAuthority;

public class AirportRulesRunner {

	public static void main(String[] args) {
		
		AirportStaf airportStaf=new AirportStaf();
		
		AirportAuthority airportAuthority= new AirportAuthority(airportStaf);
		airportAuthority.stafRules();
	}

}
