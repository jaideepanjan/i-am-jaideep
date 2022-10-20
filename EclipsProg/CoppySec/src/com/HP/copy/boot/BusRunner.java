package com.HP.copy.boot;
import com.HP.copy.thing.*;

public class BusRunner {

	public static void main(String[] args) {
		
			Bus no=new Bus();
			System.out.println(no.number);
			Bus dest = new Bus();
			System.out.println(dest.destination);
			Bus source1 = new Bus();
			System.out.println(source1.source);
			no.number = 14;
			System.out.println("The bus number is :" +no.number);
			dest.destination="Shivamogga";
			System.out.println("The Destination is :"  +dest.destination);
			source1.source="Bangloor";
			System.out.println("The source is : "  +source1.source);
			dest.destination="Mysuru";
			System.out.println("The Destination is :"  +dest.destination); 
	}

}
