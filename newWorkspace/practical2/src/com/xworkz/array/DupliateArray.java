package com.xworkz.array;

import java.util.Iterator;

public class DupliateArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 6, 5, 4, 7, 8, 2, 3 };

		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println(num[i]);

			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}

		}

	}

}