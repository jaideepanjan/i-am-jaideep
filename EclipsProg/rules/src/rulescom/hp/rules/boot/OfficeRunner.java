package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Office;

public class OfficeRunner {

	public static void main(String[] args) {
		
		Office office=new Office();
		System.out.println(office.beActive());
		System.out.println(office.carParking());
		System.out.println(office.dressCode());
		System.out.println(office.intime());
		System.out.println(office.idCard());

	}

}
