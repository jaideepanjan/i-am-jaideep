class BikeRunner{
	public static void main(String[] vahana)
	{
		Bike.printProperties();
		Bike.size='U';
		Bike.strength="very strong";
		Bike.comfort=true;
		Bike.stiffness="resisted to any kind of forces";
        Bike.type="Sports";		
		String [] name={"fzs","bullet","access","activa","plessure","fassino","discover","ninja250","bmw4","dio","apachie","shine",};
	    Bike.names=name;
		String [] colors={"blue","red","silver","white","grey","black","voilet","orange","green","stealthblack","brown","pink",};
		Bike.color=colors;
		String [] company={"yamaha","RE","TVS","BMW","KAWASAKI","HONDA","HERO","SUZUKI","OKINAVA","ATHER","BAJAJ","JAWA",};
		Bike.companynames=name;
		byte [] years={100,89,98,75,48,102,114,69,87,85,84,97};
		Bike.durability=years;
		double [] agalas={4.5,6.5,7.2,2.6,6.8,4.9,8.9,7.6,3.2,5.5,9.5,7.6};
		Bike.width=agalas;
		double [] ettaras={11.2,12.2,15.2,14.3,17.68,16.5,17.25,19.25,16.3,13.6,10.5,14.25};
		Bike.height=ettaras;
		double [] bharas={132.2,145.25,253.25,180.32,125.25,145.35,138.6,189.6,165.25,175.5,187.4,155.8};
		Bike.weight=bharas;
		short [] roundness={320,456,658,854,254,365,125,421,285,498,312,258};
		Bike.rimsize=roundness;
		long [] cost={245146L,147855L,273154L,701548L,120125L,254892L,123654L,125479963L,89654L,94562L,102565L,45896236L};
		Bike.price=cost;
		int [] speedo={143,158,121,147,85,75,48,65,98,47,83,96};
		Bike.speed=speedo;
		String [] materials={"steel","iron","plastic","fiber","mixed","gold","alluminium","bronze","silicon","ironsteel","stainlesssteel","rubber",};
		Bike.material=materials;
		String [] model={"v2","bhts","bmwres","iactiva","rx","himalaya","duskn","vng","bmw4s","kawav3","bulletv2","achs",};
		Bike.modelnames=model;
		
		Bike.printProperties();
		
	}
}