class GroceryStore{
		
	static String storeName;
	static String type;
	static int noOfEmployes;
	static boolean onlineDelivary;
	static int noOfFloure;
	static String typeOfPackage;
	static boolean cashOnDelivary;
	static boolean offers;
	static String billingType;
	static String language;
	static int storeRooms;
	static long licenceNo;
	static long gstNo;
	
	
	
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
	static void setOnlineDelivary(boolean value)
    {
		onlineDelivary=value;	
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
	static void setStoreRoom(String value)
    {
		storeroom=value;	
    }
	static void setLicenceNO(long value)
    {
		licenceNo=value;	
    }
	static void setGSTNO(long value)
    {
		gstNo=value;	
    }
	
	
	static String getName()
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
	
    static boolean getOnlineDelivary()
	{
		return onlineDelivary;
	}
	
    static int getNoOfFloure()
	{
		return noOfFloure;
	}
	
    static String getTypeOfPackage()
	{
		return typeOfPackage;
	}
	
    static boolean getCashOnDelivary()
	{
		return storeName;
	}
	
    static boolean getOffers()
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
	static int getStoreroom()
	{
		return storeroom;
	}
	static long getLicenceNo()
	{
		return licenceNo;
	}
	static long getGSTNo()
	{
		return gstNo;
	}
	
}