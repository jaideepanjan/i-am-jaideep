package com.hp.copy.boot;

import com.hp.copy.thing.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		System.out.println("Accessing all details by calling the methods");
		short products=54;
		
		String[] brands= {"SAMSUNG","Apple","OPPO","Vivo","ReadMe","NOKIA"};
	    String[] types= {"Androide","Macintosh"};
		long[] modles= {2018,2019,2020, 2021 };
		long[] price= {20000,15000,8000,25000};
		String[] colours= {"Crystal White","Red","Pink","Blue","Black"};
		int[] rams= {6,8,12,18};
		Mobile mobile=new Mobile("Phone", "India",true,true,4.5f,brands,types, modles,price,colours,rams);
		
		mobile.enterDetails();
		
	}

}
