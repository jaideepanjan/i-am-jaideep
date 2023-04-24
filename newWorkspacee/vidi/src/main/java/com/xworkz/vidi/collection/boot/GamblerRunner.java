package com.xworkz.vidi.collection.boot;

import com.xworkz.vidi.collection.interfaces.Gambler;
import com.xworkz.vidi.collection.util.GamblerUtil;

public class GamblerRunner {

	public static void main(String[] args) {


		Gambler gambler=(kasu)->{
			System.out.println(kasu);
			if(kasu >500 &&kasu <1000) {
				return 0;
			}else if(kasu >1000) {
				return 100;
			}
			return 0;
		};
		
		 System.out.println( GamblerUtil.chor(gambler));

	}

}
