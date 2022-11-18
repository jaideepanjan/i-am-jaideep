package com.hp.inheritance.boot;

import com.hp.inheritance.thing.Satellite;
import com.hp.inheritance.thing.childClass.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {
		
		Satellite satellite=new Moon("Moon", 4.53D, 1.62D,6.3);
		satellite.baChandra();
		
		
		
		Moon moon=new Moon("Sun",4.6D,274D,9.5);
		moon.baChandra();

	}

}
