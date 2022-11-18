package com.hp.inheritance.boot;

import com.hp.inheritance.thing.Home;
import com.hp.inheritance.thing.childClass.PaiedGest;

public class HomeRunner {

	public static void main(String[] args) {
		Home home=new Home();
		home.jointFamily();
		home.SeparateFamily();
		
		PaiedGest paiedGest=new PaiedGest(86,"Building",false,"Pay 2000Rs");
		paiedGest.jointFamily();
		paiedGest.SeparateFamily();

	}
	
	

}
