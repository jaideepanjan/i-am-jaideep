package com.xworkz.morningClass.EqualMethod;

public class Park {
	
	private String name;
	private double sqft;
	private int noOfTrees;
	private int noOfChairs;
	private boolean childrensAlowed;
	private String type;
	
	public Park() {
		System.out.println("Running no arg cond in Park");
	}

	public Park(String name, double sqft, int noOfTrees, int noOfChairs, boolean childrensAlowed, String type) {
		super();
		this.name = name;
		this.sqft = sqft;
		this.noOfTrees = noOfTrees;
		this.noOfChairs = noOfChairs;
		this.childrensAlowed = childrensAlowed;
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in Park");
		if(obj!=null) {
			System.out.println("obj is not null");
			if(obj instanceof Park) {
				System.out.println("Obj is instance og park can Compare");
				Park casted=(Park)obj;
				Park park=this;
				Park park2=casted;
				
				if(park.name.equals(park2.name)&&park.sqft==park2.sqft&&park.noOfTrees==park2.noOfTrees&&park.noOfChairs==park2.noOfChairs&&park.childrensAlowed==park2.childrensAlowed&&park.type.equals(park2.type)) {
					System.out.println("Park1 and park2 are same");
					return true;
				}
				else {
					System.out.println("Park1 and park2 are not same");
				}
				
			}
			else {
				System.out.println("Obj is instance og park can Compare");
			}
		}
		else {
			System.out.println("obj is null");
		}
		
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Park [name=" + name + ", sqft=" + sqft + ", noOfTrees=" + noOfTrees + ", noOfChairs=" + noOfChairs
				+ ", childrensAlowed=" + childrensAlowed + ", type=" + type + "]";
	}
	
	

}
