package com.xworkz.morningClass.EqualMethod;

public class Fridge {
	
	private String name;
	private String colour;
	private String type;
	private boolean smart;
	private boolean handle;
	private float stars;
	private boolean portable;
	private int power;
	private double valtage;
	private double current;
	private int idNo;
	private int noOfStands;
	private boolean ecoFriend;
	private boolean freezer;
	
	
	public Fridge() {
		System.out.println("running no arg cons in FRidge"); 
	}


	public Fridge(String name, String colour, String type, boolean smart, boolean handle, float stars, boolean portable,
			int power, double valtage, double current, int idNo, int noOfStands, boolean ecoFriend, boolean freezer) {
		
		this.name = name;
		this.colour = colour;
		this.type = type;
		this.smart = smart;
		this.handle = handle;
		this.stars = stars;
		this.portable = portable;
		this.power = power;
		this.valtage = valtage;
		this.current = current;
		this.idNo = idNo;
		this.noOfStands = noOfStands;
		this.ecoFriend = ecoFriend;
		this.freezer = freezer;
	}

	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Rinning equals method in Fridge");
		if(obj!=null) {
			System.out.println("Obj is not null");
			if(obj instanceof Fridge) {
				System.out.println("Obj is instance og Fridge can compare");
				Fridge casted=(Fridge)obj;
				Fridge fridge=this;
				Fridge fridge2=casted;
				if(fridge.name.equals(fridge2.name)&&fridge.type.equals(fridge2.type)&&fridge.smart==fridge2.smart&&fridge.handle==fridge2.handle&&fridge.stars==fridge2.stars&&fridge.portable==fridge2.portable&&fridge.power==fridge2.power&&fridge.valtage==fridge2.valtage&&fridge.current==fridge2.current&&fridge.idNo==fridge2.idNo&&fridge.noOfStands==fridge2.noOfStands&&fridge.ecoFriend==fridge2.ecoFriend&&fridge.freezer==fridge2.freezer) {
					System.out.println("Fridge1 and fridge2 both are Same");
					return true;
				}
				else {
					System.out.println("Fridge1 and fridge2 both are not Same");
				}
			}
			else {
				System.out.println("Obj is not instance og Fridge can compare");
			}
		}
		else {
			System.out.println("Obj is pointing to null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Fridge [name=" + name + ", colour=" + colour + ", type=" + type + ", smart=" + smart + ", handle="
				+ handle + ", stars=" + stars + ", portable=" + portable + ", power=" + power + ", valtage=" + valtage
				+ ", current=" + current + ", idNo=" + idNo + ", noOfStands=" + noOfStands + ", ecoFriend=" + ecoFriend
				+ ", freezer=" + freezer + "]";
	}
	
	
	
	

}
