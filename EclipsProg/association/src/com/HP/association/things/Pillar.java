package com.HP.association.things;

import com.HP.association.constants.Shape;

public class Pillar {
	public int id;
	public String place;
	public Shape shape= Shape.TRIANGLE; 
	public double height;
	public boolean supporting;
	public Company company;
	
	public Pillar(int id,String place,Shape shape,double height,boolean supporting, String String) {
		super();
		this.id=id;
		this.place=place;
		this.shape=shape;
		this.height=height;
		this.supporting=supporting;		
	}
	public void showoff() {
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.shape);
		System.out.println(this.height);
		System.out.println(this.supporting);
		 Company company=new Company("Ashoka Pillars","Commercial");
		 company.showoff();
		 
	}

}
