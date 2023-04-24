package com.xworkz.vidi.collection.boot;

import com.xworkz.vidi.collection.interfaces.Shooter;
import com.xworkz.vidi.collection.util.ShooterUtil;

public class ShooterRunner {

	public static void main(String[] args) {
		System.out.println("Shooter Runner ");
		
		
		
		
		System.out.println(
		ShooterUtil.aim((done)->{
			System.out.println(done);
			return true;
		}));

	}

}
