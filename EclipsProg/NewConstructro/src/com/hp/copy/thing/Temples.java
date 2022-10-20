package com.hp.copy.thing;

public class Temples {
	public String nameOfTheCountry;
	public boolean clean;
	public boolean facilityes;
	public boolean onlineBooking;
	public float custermerReview;
	public String[] names;
	public String[] states;
	public String[] styles;
	public String[] shapes;
	public String[] parts;
	public String[] modeOfTraveling;
	
	public Temples(String nameOfTheCountry,boolean clean,boolean facilityes,boolean onlineBooking,float custermerReview,String[] names,String[] states,String[] Styles,String[] shapes,String[] ingredints,String[] modeOfTraveling)
	{
		System.out.println("Parameterised constructor of Class Temples");
		this.nameOfTheCountry=nameOfTheCountry;
		this.clean=clean;
		this.facilityes=facilityes;
		this.onlineBooking=onlineBooking;
		this.custermerReview=custermerReview;
		this.names=names;
		this.states=states;
		this.styles=Styles;
		this.shapes=shapes;
		this.parts=parts;
		this.modeOfTraveling=modeOfTraveling;
	}
	public void enterDetails() {

		
		System.out.println("The country name is : "+this.nameOfTheCountry);
		System.out.println("Is temples are clean environment : "+this.clean);
		System.out.println("Is good Fecilityes : "+this.facilityes);
		System.out.println("Is availability of online ticket booling for dharshana : "+this.onlineBooking);
		System.out.println("Custemer review about cake : "+this.custermerReview);
		System.out.println("Temple names : "+this.names);
		System.out.println("The most famus states of temples : "+this.states);
		System.out.println("Styles of temples : "+this.styles);
		System.out.println("Temple Shapes : "+this.shapes);
		System.out.println("Main parts of the temple : "+this.parts);
		System.out.println("WE can travel by : "+this.modeOfTraveling);
		
		System.out.println("loop of elements");
		
		for (int i = 0; i < this.names.length; i++) {
			String names = this.names[i];
			System.out.println(names);
			
		}
		for (int i = 0; i < this.states.length; i++) {
			String states = this.states[i];
			System.out.println(states);
			
		}
		for (int i = 0; i < this.styles.length; i++) {
			String styles = this.styles[i];
			System.out.println(styles);
			
		}
		for (int i = 0; i < this.shapes.length; i++) {
			String shapes = this.shapes[i];
			System.out.println(shapes);
			
		}
		for (int i = 0; i < this.parts.length; i++) {
			String parts = this.parts[i];
			System.out.println(parts);
			
		}
		for (int i = 0; i < this.modeOfTraveling.length; i++) {
			String modeOfTraveling = this.modeOfTraveling[i];
			System.out.println(modeOfTraveling);
			
		}

		
			
	
	}
	

}
