class ToothpasteRunner{
	public static void main(String...tp)
	{
		
		System.out.println("Details of Tooth Paste is started");
		Toothpaste.name="Closeup";
		Toothpaste.brand="Unilevel";
	    Toothpaste.isiMark=true;
	    Toothpaste.content="Sodium Fluorid";
	    Toothpaste.company="Hindustan Unilevel Company";
	    Toothpaste.dagno=210122L;
        Toothpaste.netweight=90;
	    Toothpaste.formula="Triple Fresh Formula";
	    Toothpaste.hashtag="Free To Love"; 
	    Toothpaste.website="WWW.Close-up.com";
	    Toothpaste.surveyno=255126L;
	    Toothpaste.type="Vegitarian";
	    Toothpaste.color="Red";
        Toothpaste.made="India";
	    Toothpaste.technology="Anti-Germ Mouth Wash";
	    Toothpaste.since=1965L;
	    Toothpaste.containerType="Tube";
	    Toothpaste.length=4.3F;
	    Toothpaste.breadth=17.5D;
	    Toothpaste.price=48L;
		
		Toothpaste.printToothpasteDetails();
		
		String brand=Toothpaste.getBrand();
		if(brand=="Unilevel")
		{
			System.out.println("Closeup Toothpaste is product of Unilevel Brand");
		}
		else{
			System.out.println("The Brand Name is Wrong");
		}
		System.out.println(" Dtails of Toothpaste is Completed");
	}


}