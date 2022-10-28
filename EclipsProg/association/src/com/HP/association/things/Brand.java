package com.HP.association.things;

public class Brand {
	public String name;
	public String gstNo;
	public String location;
	public String rating;
	
	public Brand(String name,String gstNo,String location,String rating) {
		super();
		this.name=name;
		this.gstNo=gstNo;
		this.location=location;
		this.rating=rating;		
	}
	public void showoff() {
		System.out.println(" The name of the Brand : " +this.name);
		System.out.println(" GST No : " +this.gstNo);
		System.out.println(" Locating : "+this.location);
		System.out.println(" Rating : "+this.rating);
	}
	

}
