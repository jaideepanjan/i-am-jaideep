package com.hp.access.things;

public class Lectern {
	private String material="Wood";
	private String colour="Brown";
	private String typeOfMaterial="Teak Wood";
	public double height;	
	public double width;
	public boolean portable;
	public String baseAngle;
	public int warrenty;
	public boolean paperStop;
	public boolean cable;
	public boolean mike;
	
	
	
	public Lectern(double height, double width, boolean portable, String baseAngle, int warrenty, boolean paperStop,
			boolean cable, boolean mike) {
		super();
		this.height = height;
		this.width = width;
		this.portable = portable;
		this.baseAngle = baseAngle;
		this.warrenty = warrenty;
		this.paperStop = paperStop;
		this.cable = cable;
		this.mike = mike;
	}
	public String getMaterial() {
		return this.material;
	}
	void setMaterial(String material) {
		this.material=material;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}
	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}
	
}
