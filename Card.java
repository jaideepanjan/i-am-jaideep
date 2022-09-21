class Card{
	static String type;
	static double width;
	static double height;
	static int price;
	static String [] colors;
	
	static void displayDetails()
	{
		System.out.println(type);
		System.out.println(width);
		System.out.println(height);
		System.out.println(price);
		if(colors!=null)
		{
			System.out.println("array is pointing to memory addreess of colors");
			System.out.println("no of colors:"+colors.length);
			for(int rainbow=0; rainbow<colors.length; rainbow++)
			{
				String ref=colors[rainbow];
				System.out.println(ref);
			}
		}
		else
		{
			System.out.println("array is not pointing to any color address");
		}
	}
}