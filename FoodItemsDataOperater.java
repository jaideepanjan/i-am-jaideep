class FoodItemsDataOperater {
	
	static String[] foodItemsList={null, null, null, null, null, null, null};
	static int position=0;
	static void save(String foodItems)
	{
		System.out.println("save : FoodItem list Started");
		foodItemsList[position]=foodItems;
		position++;
		System.out.println("Saved "+foodItems +" Position "+position);
		
	}
	static void displayname(){
		for(int list=0; list<=foodItemsList.length;list++){
			String names=foodItemsList[list];
			System.out.println(names);
		}
		System.out.println("save : FoodItem list Ended");
		
	}
}