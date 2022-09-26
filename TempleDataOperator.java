class TempleDataOperator{
	
	static String[] temples={null, null, null, null};
	static int position=0;
	static void save(String temples)
	{
		System.out.println("save : Temple list Started");
		templeNames[position]=name;
		position++;
		System.out.println("Saved "+name +"Position "+position);
		System.out.println("save : Temple list Ended");
	}
	static void displayname(){
		for(int list=0; list<temples.length;list++){
			String Names=temples[list];
			System.out.println(Names);
		}
	}
}