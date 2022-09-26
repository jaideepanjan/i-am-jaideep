class PoliticianDataOperator {
	
	static String[] PoliticianList={null, null, null, null, null, null, null};
	static int position=0;
	static void save(String Politicians)
	{
		System.out.println("save : Politician list Started");
		PoliticianList[position]=Politicians;
		position++;
		System.out.println("Saved "+Politicians +" Position "+position);
		
	}
	static void displayname(){
		for(int list=0; list<=PoliticianList.length;list++){
			String names=PoliticianList[list];
			System.out.println(names);
		}
		System.out.println("save : Politician list Ended");
		
	}
}