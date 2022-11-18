package com.hp.access.things;

public class Carpenter {
	public String name="Shreenivas";
	public Lectern lectern= new Lectern(4.25,1.45,false,"Quadrangl",1,true,true,false );
	
	public void callLectern() {
		System.out.println(this.name);
		if(this.lectern!=null) {
	System.out.println("Fully qualified name : "+this.lectern);
		System.out.println("Height og the Lectern : "+lectern.height +"Feet");
		System.out.println("Width of the Lectern : "+lectern.width +"Feet");
		System.out.println("Is Lectern can portable : "+lectern.portable);
		System.out.println("Base angle of the Lectern : "+lectern.baseAngle);
		System.out.println("Warrenty "+lectern.warrenty +"Year");
		System.out.println("Isn't paper stop is fixed : "+lectern.paperStop);
		System.out.println("Isn't Cable hole/gap is provided : "+lectern.cable);
		System.out.println("Isn't mike can connect : "+lectern.mike);
	
		System.out.println(lectern.getMaterial());
		lectern.setMaterial("Metal");
		System.out.println("Modified material : " +lectern.getMaterial());
		
		System.out.println(lectern.getColour());
		lectern.setMaterial("Pink");
		System.out.println("Modified Colour : " +lectern.getColour());
		
		System.out.println(lectern.getTypeOfMaterial());
		lectern.setMaterial("Casted Iron");
		System.out.println("Modified type of material : " +lectern.getTypeOfMaterial());
		}
		else {
			System.out.println("Lectern is null");
		}
	}

}
