package com.xworkz.morningClass.casting;

public class RotiRunner {

	

	public static void main(String[] args) {
		

		
	
	  
	    
	    OnionMasalaRagiRoti roti1=new OnionMasalaRagiRoti();
	    float thickness=roti1.getThickNess();
	    System.out.println(thickness);
	    double weight=roti1.getWeight();
	    System.out.println(weight);
	    double calories=roti1.getCalories();
	    System.out.println(calories);
	    String shape=roti1.getShape();
	    System.out.println(shape);
	    
	   
	    
	    if(roti1 instanceof OnionMasalaRagiRoti) {
	    Roti roti2=(OnionMasalaRagiRoti)roti1;
	    
	    roti2.getShape();
	    System.out.println("Roti instanceof OnionMasalaRagiRoti");
	    }
	    else {
	    	 System.out.println("Roti is not instanceof OnionMasalaRagiRoti");
	    }
	    
	    
	    
	    
	    
				
		

	}

}
