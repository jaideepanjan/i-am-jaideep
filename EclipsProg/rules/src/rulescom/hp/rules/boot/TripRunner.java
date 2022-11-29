package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Trip;
import rulescom.hp.rules.followers.TripRules;

public class TripRunner {

	public static void main(String[] args) {
		
		Trip trip=new Trip();
		System.out.println(trip.carryFood("Chapati, Rotti"));
		System.out.println(trip.dresscode("Farmal"));
		System.out.println(trip.footware('2'));
		System.out.println(trip.expenciveThings("Gold"));
		System.out.println(trip.unity());
		
		System.out.println();
		
		Trip trip1=new Trip();
		System.out.println(trip.carryFood("Chatnipudi Chitranna"));
		System.out.println(trip.dresscode("Im Formal"));
		System.out.println(trip.footware('1'));
		System.out.println(trip.expenciveThings("Money"));
		System.out.println(trip.unity());

	}

}
