package com.HP.copy.thing;

public class Bread {
	public String type;
	public char shape;
	public int price;
	public boolean quality;
	public String companyName;
	
	public Bread()
	{
		System.out.println("Padma Breads are good in taste and quality");
	}
	
	public Bread(String type, String companyName)
	{
		this.type=type;
		this.companyName=companyName;
		System.out.println("Constructor one");
	}

}
