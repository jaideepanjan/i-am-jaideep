package com.hp.copy.boot;
import com.hp.copy.thing.Cake;

public class CakeRunner {

	public static void main(String[] args) {
		
		System.out.println("Accessing all details by calling the methods");
		short quantityes=20;
		
		String[] flevers= {"Choclet","Pineapple","Blackberry","Blueberry",};
	    String[] colours= {"Black","Green","Blue","White"};
		String[] names= {"Pestery","Honey Cake","Plain Cake", "IceCream Cake" };
		String[] shapes= {"Guytar","Star","Circul","Square"};
		String[] ingredints= {"Suger","Egg","East","Milk","etc..."};
		String[] qualityes= {"High","Low","Medium"};
		Cake cake=new Cake("JPK Bekery", 250,false,true,4.5f,flevers,colours, names,shapes,ingredints,qualityes);
		
		cake.enterDetails();
		
		
	}

}
