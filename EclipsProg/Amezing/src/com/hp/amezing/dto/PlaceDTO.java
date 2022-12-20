package com.hp.amezing.dto;

public class PlaceDTO extends AbstractAuditDTO {
	
	private String name;
	private String region;
	private long area;
	private boolean childrensAllowed;
	private String famousFor;
	
	public PlaceDTO() {
		super();
		System.out.println("Running default constructer of Place DTO");
	}

	public PlaceDTO(String name, String region, long area, boolean childrensAllowed, String famousFor) {
		this.name = name;
		this.region = region;
		this.area = area;
		this.childrensAllowed = childrensAllowed;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", region=" + region + ", area=" + area + ", childrensAllowed="
				+ childrensAllowed + ", famousFor=" + famousFor + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	public boolean isChildrensAllowed() {
		return childrensAllowed;
	}

	public void setChildrensAllowed(boolean childrensAllowed) {
		this.childrensAllowed = childrensAllowed;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	
	
	
	

}
