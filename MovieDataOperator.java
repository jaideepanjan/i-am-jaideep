class MovieDataOperator{
	
	static String[] movieList={null, null, null, null, null, null, null};
	static int position=0;
	static void save(String movies)
	{
		System.out.println("save : Movie list Started");
		movieList[position]=movies;
		position++;
		System.out.println("Saved "+movies +" Position "+position);
		System.out.println("save : Movie list Ended");
	}
	static void displaymovies(){
		for(int list=0; list<=movieList.length;list++){
			String names=movieList[list];
			System.out.println(names);
		}
		System.out.println("save : Temple list Ended");
		
	}
}