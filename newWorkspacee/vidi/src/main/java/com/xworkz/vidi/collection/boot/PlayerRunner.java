package com.xworkz.vidi.collection.boot;

import com.xworkz.vidi.collection.interfaces.Player;
import com.xworkz.vidi.collection.util.PlayerUtil;

public class PlayerRunner {

	public static void main(String[] args) {

		Player player = (a, b) -> {
//			System.out.println(a.toUpperCase());

			return a.toUpperCase();
		};
	System.out.println(	PlayerUtil.person(player));

		Player player2 = (c, d) -> {
//			System.out.println(c.toLowerCase());
			return c.toLowerCase();
		};

		System.out.println(PlayerUtil.person(player2));
		
		
		Player player3=(e,f)->{
			
//			System.out.println(e+"     "+f);
			
			return e+" "+f;
			
		};
		
		System.out.println(PlayerUtil.person(player3));
		
	}

}
