class Rangu{
	static String[] myFevColors={null, null, null, null, null, null, null, null, null};
	static int position=0;
	static void save(String fevColors){
		myFevColors[position]=fevColors;
		position++;
	{
		if(position>9)
		{
			System.out.println("Colors are not printing");
			return;
		}
		if(myFevColors!=null && myFevColors.length()>=3)
		{
			System.out.println("Colors valied");
		}
		else{
			Systrem.out.println("Colors invalied");
		}
		static void display(){
			for(int index=0; index<myFevColors.length; index++){
				String ref=myFevColors[index];
				System.out.println("Colors in respective index "+ref);
			}
		}
		 static boolean found(String color){
			 if(color!=null&&color.length()>=3){
				 System.out.println("This color found");
				 for(int find=0; find<colors.length;find++);{
					 String ref=colors[find];
					 if(ref=color){
						 System.out.println("Color visible");
						 return true;						 
					 }
				 }
			  }
			  else{
				  System.err.println("Color not Visible");
			  }return false;
		 }
	}
	}