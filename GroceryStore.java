class GroceryStore{
		
	static String storeName;
	static String type;
	static int noOfEmployes;
	static boolean onlineShoping;
	static int noOfFloure;
	static String typeOfPackage;
	static boolean cashOnDelivary;
	static boolean offers;
	static String billingType;
	static String language;
	static int storeRooms;
	static long licenceNo;
	static long gstNo;
	static String partnership;
	
	
	
    static void setStoreName(String value)
    {
		storeName=value;	
    }
	 static void setType(String value)
    {
		type=value;	
    }
	static void setnoOfEmployes(int value)
    {
		noOfEmployes=value;	
    }
	static void setOnlineShoping(boolean value)
    {
		onlineShoping=value;	
    }
	static void setNoOfFloure(int value)
    {
		noOfFloure=value;	
    }
	static void setTypeOfPackage(String value)
    {
		typeOfPackage=value;	
    }
	static void setCashOnDelivary(boolean value)
    {
		cashOnDelivary=value;	
    }
	static void setOffers(boolean value)
    {
		offers=value;	
    }
	static void setBillingType(String value)
    {
		billingType=value;	
    }
	static void setLanguage(String value)
    {
		language=value;	
    }
	static void setStoreRooms(int value)
    {
		storeRooms=value;	
    }
	static void setLicenceNO(long value)
    {
		licenceNo=value;	
    }
	static void setGSTNO(long value)
    {
		gstNo=value;	
    }
	 static void setPartnership(String value)
    {
		partnership=value;	
    }
	
	
	static String getStoreName()
	{
		return storeName;
	}
	 static String getType()
	{
		return type;
	}	
    static int getNoOfEmployes()
	{
		return noOfEmployes;
	}
	
    static boolean isOnlineShoping()
	{
		return onlineShoping;
	}
	
    static int getNoOfFloure()
	{
		return noOfFloure;
	}
	
    static String getTypeOfPackage()
	{
		return typeOfPackage;
	}
	
    static boolean isCashOnDelivary()
	{
		return cashOnDelivary;
	}
	
    static boolean isOffers()
	{
		return offers;
	}
	
    static String getBillingType()
	{
		return billingType;
	}
	
	static String getLanguage()
	{
		return language;
	}
	static int getStorerooms()
	{
		return storeRooms;
	}
	static long getLicenceNo()
	{
		return licenceNo;
	}
	static long getGSTNo()
	{
		return gstNo;
	}
	static String getPartnership()
	{
		return partnership;
	}
	
	static void printGroceryStoreDetails()
	{
	System.out.println(storeName);
	System.out.println(type);
	System.out.println(noOfEmployes);
	System.out.println(onlineShoping);
	System.out.println(noOfFloure);
	System.out.println(typeOfPackage);
	System.out.println(cashOnDelivary);
	System.out.println(offers);
	System.out.println(billingType);
	System.out.println(language);
	System.out.println(storeRooms);
	System.out.println(licenceNo);
	System.out.println(gstNo);
	System.out.println(partnership);	
		
	}
	
}