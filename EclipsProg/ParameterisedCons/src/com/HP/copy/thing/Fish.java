package com.HP.copy.thing;

public class Fish {
	public String name;
	public String type;
	public int price;
	public int weight;
	public double length;
	
	public Fish() 
	{
		System.out.println("I love Fish");
	}
	
	public Fish(String name, int price)
	{
		this.name=name;
		this.price=price;
		System.out.println("Calling constructer first time");
	}
	
	public Fish(double length, String type)
	{
		this.length=length;
		this.type=type;
		System.out.println("Calling constructer Second time");
	}
	public Fish(int weight, String name)
	{
		this.weight=weight;
		this.name=name;
		
		System.out.println("Calling constructer Third time");
	}
	
	public Fish(String name, double length)
	{
		this.name=name;
		this.length=length;
		
		System.out.println("Calling constructer Fourth time");
	}

	
	public Fish(double length, int weight)
	{
		this.length=length;
		this.weight=weight;
		
		System.out.println("Calling constructer Fifth time");
	}

	
	public Fish(String name, String type)
	{
		this.name=name;
		this.type=type;
		
		System.out.println("Calling constructer Sixth time");
	}

	
	public Fish(int weight, int price)
	{
		this.weight=weight;
		this.price=price;
		
		System.out.println("Calling constructer Seventh time");
	}
	
	public Fish(int price, double length)
	{
		this.price=price;
		this.length=length;
		
		System.out.println("Calling constructer Seventh time");
	}
	
	
	

}
