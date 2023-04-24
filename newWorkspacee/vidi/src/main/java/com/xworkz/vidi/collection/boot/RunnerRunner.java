package com.xworkz.vidi.collection.boot;

import com.xworkz.vidi.collection.interfaces.Runner;
import com.xworkz.vidi.collection.util.RunnerUtil;

public class RunnerRunner {

	public static void main(String[] args) {
		System.out.println("Running Runner in main");
		
		
		Runner runner= (win)->{
			System.out.println(win);
			return 52.3f;
		};
		
		System.out.println(RunnerUtil.race(runner));

	}

}
