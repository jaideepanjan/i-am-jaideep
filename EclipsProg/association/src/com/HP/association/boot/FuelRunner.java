package com.HP.association.boot;
import com.HP.association.things.*;

public class FuelRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoked the fuel , Fuel type");
		Fuel fuel=new Fuel(true,123.35, 62);
		fuel.totalPrice();
		fuel.reading();
		

	}

}
