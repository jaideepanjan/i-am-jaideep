package com.hp.inheritance.boot;

import com.hp.inheritance.thing.Director;
import com.hp.inheritance.thing.childClass.Prashanth;

public class DirectorRunner {

	public static void main(String[] args) {
		Director director=new Director("Rocking", 25, 7,true);
		director.printMadu();
		
		
		
		Prashanth prashanth=new Prashanth("Historic",26,10,true);
		prashanth.printMadu();

	}

}
