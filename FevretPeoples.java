class FevretPeoples{
	static String[] fevretPeoples={null, null, null, null, null, null, null, null, null, null};
	static int position=0;
	static void save(String name)
	{
		if(position>=10)
		{
			System.out.println("Welcome to my heart");
			return;
		}
		if(fevretPeoples!=null && name.length()>=4)
		{
			fevretPeoples[position]=name;
			System.out.println("name " +name + " : "+position);
			position++;
		}
	}
	static void display()
	{
		for(int fP=0; fP<fevretPeoples.length; fP++)
		{
			String ref=fevretPeoples[fP];
			System.out.println(ref);
		}
	}
	static boolean find(String name)
	{
		if(fevretPeoples!=null && name.length()>=4)
		{
			for(int j=0; j<fevretPeoples.length; j++)
			{
				String ref=fevretPeoples[j];
			    if(ref==name)
			     {
                  System.out.println("name found :" +ref);
                  return true;
			     }
		    }
	    }
        return false;
   }
   static String update(String realName, String nickName) 
   {
    if(realName!=null && nickName!=null)
	{
     if(realName.length()>=4 && nickName.length()>=4)
	 {
		 for(int point=0; point<fevretPeoples.length; point++)
		 {
			 String ref=fevretPeoples[point];
			 if(ref==realName)
			 {
				 System.out.println("Real Name :"+ref);
				 fevretPeoples[point]=nickName;
				 System.out.println("Updated Name : "+nickName );
				 return nickName;
			 }
		 }
	 }
	}
	return null;
   }
   static String update1(int index1, String nickName)
   {
	   if(nickName!=null && nickName.length()>=4)
	   {
		   System.out.println("Real Point :"+nickName);
		   return nickName;
	   }
	   return "update1";
   }   
	   static boolean delete(String name)
	   {
        if(fevretPeoples!=null && name.length()>=4)
		{
			for(int pet=0; pet<fevretPeoples.length; pet++)
			{
				String ref=fevretPeoples[pet];
				if(ref==name)
				{
					System.out.println("Entered name"+name);
					ref=null;
					System.out.println("Name Deleted :" +ref);
					return true;
				}
			}
		}
		return true;
	   }
	   static boolean delete1(int index, String name)
	   {
		   if(name!=null && name.length()>=4)
		   {
			   System.out.println("Index :" +index);
			   fevretPeoples[index]=name;
			   name=null;
			   System.out.println("Update Name :"+name);
			   return true;
		   }
		   return false;
	   }
   }










