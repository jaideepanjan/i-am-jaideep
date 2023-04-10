package com.xworkz.jet.utils;

public class JetUtil {

	public JetUtil() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	public static boolean validString(String things) {
		if (things != null && !things.isEmpty() && things.length() > 3 && things.length() < 40) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int noOfSeats) {
		if (noOfSeats > 5 && noOfSeats < 525) {
			return true;
		}
		return false;
	}

	public static boolean validDouble(double weight) {
		if (weight > 0 && weight < 589670.00) {
			return true;
		}
		return false;
	}

	public static boolean validFloat(float gravity) {
		if (gravity > 0.1f) {
			return true;
		}
		return false;
	}

	public static boolean validAll(boolean... valid) {
		for (int index = 0; index < valid.length; index++) {
			boolean element = valid[index];
			if (!element) {
				System.out.println("Invalid element at index : " + index);
				return false;
			}
		}
		return true;
	}

}
