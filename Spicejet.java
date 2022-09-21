class Spicejet{
	
	static void flightsNos(String [] flightsNos)
	{
		System.out.println("accessing the flightsNos");
		System.out.println("flightsNos:"+flightsNos.length);
		
		for(int index=0;index<flightsNos.length;index++)
		{
		
		String ref= flightsNos[index];		
		System.out.println(ref);
		
		}
		System.out.println("accessed the flight nos");
	}
	
}