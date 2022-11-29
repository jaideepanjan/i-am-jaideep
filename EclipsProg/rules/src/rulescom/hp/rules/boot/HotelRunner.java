package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Hotel;
import rulescom.hp.rules.followers.HotelRules;

public class HotelRunner {

	public static void main(String[] args) {
		
		Hotel hotel=new Hotel();
		
		System.out.println(hotel.donotWashInPlate());
		System.out.println(hotel.dontWastFood());
		System.out.println(hotel.GiveChange());
		System.out.println(hotel.handWash());
		System.out.println(hotel.payBeforeEat());

	}

}
