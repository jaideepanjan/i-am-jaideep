package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Municipality;

public class MunicipalityRunner {

	public static void main(String[] args) {
		Municipality municipality=new Municipality();
		
		System.out.println(municipality.clean());
		System.out.println(municipality.dontwastWater());
		System.out.println(municipality.dustCollection());
		System.out.println(municipality.payTax());
		System.out.println(municipality.waterSuply());

	}

}
