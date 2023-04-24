package com.xworkz.vidi.collection.boot;

import com.xworkz.vidi.collection.util.HunterUtil;

public class HunterRunner {

	public static void main(String[] args) {


		HunterUtil.test((one)->{
			System.out.println("Running functional method "+one);
		});

	}
	}


