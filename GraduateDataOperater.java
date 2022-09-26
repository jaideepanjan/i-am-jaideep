class GraduateDataOperater {
	
	static String[] graduatesList={null, null, null, null, null, null, null};
	static int position=0;
	static void save(String graduates)
	{
		System.out.println("save : Graduate list Started");
		graduatesList[position]=graduates;
		position++;
		System.out.println("Saved "+graduates +" Position "+position);
		
	}
	static void displayname(){
		for(int list=0; list<=graduatesList.length;list++){
			String names=graduatesList[list];
			System.out.println(names);
		}
		System.out.println("save : Graduate list Ended");
		
	}
}