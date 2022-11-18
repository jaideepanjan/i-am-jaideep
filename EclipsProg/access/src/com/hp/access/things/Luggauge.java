package com.hp.access.things;

public class Luggauge {
	public String name="xyz";
	public Bag bag=new Bag();
	
	public void print() {
		System.out.println(this.name);
		if(this.bag!=null) {
			System.out.println(bag.getLocation());
			bag.setLocation("bengaluru");
			System.out.println("updated location"+bag.getLocation());
		}
	}

}
