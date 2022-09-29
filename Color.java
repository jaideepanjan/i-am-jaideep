class Color{
	static String[] allColors={null, null, null, null, null, null, null};
	static int position=0;
	static void save(String colors)
	{
		if(position>=7)
		{
			System.out.println("Main");
			return;
		}
		if(allColors!=null && colors.length()>=3)
		{
			System.out.println("Start");
			allColors[position]=colors;
			System.out.println("Position"+position +"= :"+colors);
			position++;
		}
	}
	static void display()
	{
		for(int point=0; point<allColors.length; point++)
		{
			String index=allColors[point];
			System.out.println(index);
		}
	}
    static void checkColor(String colors)
	{
		if(allColors!=null && colors.length()>=3)
		{
			System.out.println("Color will find in memory");
			for(int info=0; info<allColors.length; info++)
			{
				String ref=allColors[info];
				if(ref==colors)
				{
					System.out.println("Color found : "+colors);
				}
			}
		}
		    else
			{
				System.out.println("Color not in memory");
			}
	}
}	