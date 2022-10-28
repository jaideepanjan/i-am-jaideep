package com.HP.association.things;

import com.HP.association.things.Location;

public class Mountain {
	public String name;
	public Location location;
	public double height;
	public Temple temple;
	
	public Mountain(String name,Location location,Temple temple) {
		super();
		this.name=name;
		this.height=height;
		}
	
	public Mountain(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public void visitTemple() {
		Temple temple = new Temple("Choudeswari","Shakti",0, 238D);
		temple.showoff();
		Location location = new Location("Malenadu","Shivamogga","577201",0, "india");
		location.show();
		System.out.println("Name :" +name);
		System.out.println("Height :" +height);
		
	}

}
