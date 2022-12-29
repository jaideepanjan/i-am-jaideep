package com.hp.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.hp.collections.dto.AirportDTO;
import com.hp.collections.dto.PlaceDTO;

public class AirportRunner {

	public static void main(String[] args) {
		
		AirportDTO airportDTO1=new AirportDTO("Yadiyoorappa International Airport", "Shivamogga", "Lotus", 50D, 0D);
		AirportDTO airportDTO2=new AirportDTO("Kempegowda International Airport", "Bangloor", "Wave", 4000D, 11D);
		AirportDTO airportDTO3=new AirportDTO("Manglore International Airport", "Mangloor", "Flat", 1600D, 5D);
		AirportDTO airportDTO4=new AirportDTO("Mandakalli Airport", "Mysure", "Gopura", 1740D, 5D);
		AirportDTO airportDTO5=new AirportDTO("Hubli Airport", "Hubli", "Half Circle", 2171D, 7D);
		
		Collection<AirportDTO> collection=new ArrayList<AirportDTO>();
		
		collection.add(airportDTO1);
		collection.add(airportDTO2);
		collection.add(airportDTO3);
		collection.add(airportDTO4);
		collection.add(airportDTO5);
	}

}
