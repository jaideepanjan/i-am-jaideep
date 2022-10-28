package com.HP.association.things;

public class Temple {
	public String name;
	public God god;
	public String mainPrist;
	public long noOfVisitors;
	public double collectionPerDay;
	
	public Temple(String name,String mainPrist,long noOfVisitors,double collectionPerDay) {
		super();
		this.name=name;
		this.mainPrist=mainPrist;
		this.noOfVisitors=noOfVisitors;
		this.collectionPerDay=collectionPerDay;
	}
   public void showoff() {
	   System.out.println("Name of the Temple" +name );
	   System.out.println("Main Prist of the Temple" +mainPrist );
	   System.out.println("Collection per day : " +collectionPerDay +"RS");
	   God god = new God("Vishnu","Purusha","Palaka");
	   god.showoff();
	   
   }
}
