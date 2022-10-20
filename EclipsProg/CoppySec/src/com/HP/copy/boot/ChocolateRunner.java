package com.HP.copy.boot;
import com.HP.copy.thing.*;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate nam=new Chocolate();
		Chocolate bd=new Chocolate();
		Chocolate rps=new Chocolate();
		Chocolate flr=new Chocolate();
		
		System.out.println(bd.brand);
		System.out.println(rps.prise);
		System.out.println(flr.flavor);
		nam.name="Hershry's";
		bd.brand="Nesley";
		rps.prise=245;
		flr.flavor="Strabery";
		System.out.println(nam.name);
		System.out.println(bd.brand);
		System.out.println(rps.prise);
		System.out.println(flr.flavor);
		
		flr.flavor="Chilly";
		System.out.println(flr.flavor);
		
				
		
	}

}
