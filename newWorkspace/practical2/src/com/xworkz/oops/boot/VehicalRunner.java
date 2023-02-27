package com.xworkz.oops.boot;

import com.xworkz.oops.repositary.VehicalRepoImpl;
import com.xworkz.oops.things.Aeroplane;
import com.xworkz.oops.things.IndianAirLine;
import com.xworkz.oops.things.Ship;
import com.xworkz.oops.things.Vehical;

public class VehicalRunner {

	public static void main(String[] args) {
		
		System.out.println("<-------------Encapsulation------------->");
		Vehical vehical=new Vehical();
		
		
		vehical.setType("4 weelier");
		vehical.setName("Car");
		vehical.setNoOfWeels(4);
		
		
		System.out.println("Type of vehoical : "+vehical.getType());
		System.out.println("Name of vehoical : "+vehical.getName());
		System.out.println("No of Weels : "+vehical.getNoOfWeels());
		
		System.out.println("<-------------Inheritnce------------->");
		
		
		Ship ship=new Ship();
		
		ship.setType("Naavi");
		ship.setName("JJJ");
		ship.setNoOfWeels(0);
		
		System.out.println(ship.getType()); 
		 System.out.println(ship.getName()); 
		 System.out.println(ship.getNoOfWeels());
		
		System.out.println("<-------------Pholimorphisum------------->");
		
		IndianAirLine indianAirLine=new IndianAirLine();
		
		Vehical vehical2=new Vehical();
		vehical2.detail("3willer", 3);
		vehical2.detail("FZ", "Yamaha", 2);
		

		
		
		
		indianAirLine.moveOn();
		
		System.out.println("<-------------Abstraction------------->");
		
		VehicalRepoImpl vehicalRepoImpl=new VehicalRepoImpl();
		
		vehicalRepoImpl.update();
		
		
		
		
	}

}
