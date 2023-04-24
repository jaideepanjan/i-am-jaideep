package com.xworkz.vidi.collection.boot;

import com.xworkz.vidi.collection.interfaces.Eater;
import com.xworkz.vidi.collection.util.EaterUtil;

public class EaterRunner {

	public static void main(String[] args) {

		Eater eater = (food, price) -> {
			System.out.println(food);
			return food;
		};

		System.out.println(EaterUtil.uta(eater));

		Eater eater1 = (food, price) -> {
			System.out.println(food.toLowerCase());
			return food;
		};

		System.out.println(EaterUtil.uta(eater1));

		Eater eater2 = (food, price) -> {
			System.out.println(food.toUpperCase());
			return food;
		};

		System.out.println(EaterUtil.uta(eater2));

	}

}
