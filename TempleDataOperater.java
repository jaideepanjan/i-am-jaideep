class TempleDataOperater {
	
	static String[] templesList={null, null, null, null, null, null, null};
	static int position=0;
	static void save(String temples)
	{
		System.out.println("save : Temple list Started");
		templesList[position]=temples;
		position++;
		System.out.println("Saved "+temples +" Position "+position);
		System.out.println("save : Temple list Ended");
	}
	static void displayname(){
		for(int list=0; list<=templesList.length;list++){
			String names=templesList[list];
			System.out.println(names);
		}
		System.out.println("save : Temple list Ended");
		
	}
}