package com.hp.inheritance.boot;

import com.hp.inheritance.thing.ShopingMall;
import com.hp.inheritance.thing.childClass.Orion;

public class ShoppingMallRunner {

	public static void main(String[] args) {
		ShopingMall shopingMall=new Orion("Orion", 4,"Rajkumar Road Malleswaram","Briged");
		shopingMall.printMadu();
		
		Orion orion=new Orion("LuLu",3,"Near Sujata Theater","Jaideep");
		orion.printMadu();
	}

}
