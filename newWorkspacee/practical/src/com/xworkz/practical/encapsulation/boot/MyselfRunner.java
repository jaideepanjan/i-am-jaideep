package com.xworkz.practical.encapsulation.boot;

import com.xworkz.practical.encapsulation.things.Myself;

public class MyselfRunner {
	
	public static void main(String[] args) {
		
		
		Myself me=new Myself();
		
		me.setName("Jaideep P");
		me.setAge(22);
		me.setColor("Brown");
		me.setWaight(50);
		
		
		System.out.println(me.getName());
		System.out.println(me.getAge());
		System.out.println(me.getColor());
		System.out.println(me.getWaight());
		
		
		
	}

}
