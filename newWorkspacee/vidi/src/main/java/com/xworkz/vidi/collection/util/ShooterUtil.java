package com.xworkz.vidi.collection.util;

import com.xworkz.vidi.collection.interfaces.Shooter;

public class ShooterUtil {

	public static boolean aim(Shooter shooter) {
		System.out.println("Running aim method in shootwe Util");
		shooter.shoot("Small");
		return true;
	}

}
