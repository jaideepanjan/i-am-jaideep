class GroceryStoreRunner{
	public static void main(String...gs)
	{
		System.out.println("Details about Grocery Store is printing on the console");
		
		GroceryStore.storeName="SMMS";
		GroceryStore.type="All in One";
		GroceryStore.noOfEmployes=12;
        GroceryStore.onlineShoping=true;
	    GroceryStore.noOfFloure=3;
	    GroceryStore.typeOfPackage="Paper";
	    GroceryStore.cashOnDelivary=true;
	    GroceryStore.offers=false;
	    GroceryStore.billingType="Automatic";
	    GroceryStore.language="Kannada and English";
	    GroceryStore.storeRooms=4;
	    GroceryStore.licenceNo=34587552L;
	    GroceryStore.gstNo=79455556L;
	    GroceryStore.partnership="With Many Companys";
	
		GroceryStore.printGroceryStoreDetails();
				
		String storeName=GroceryStore.getStoreName();
		
		if(storeName=="SMMS")
		{
			System.out.println("Store name is Shree Malai Mahadeswara Swamy Provision Store");
		}
		else{
			System.out.println("Store Name is Wrong");
		}
		System.out.println("Details about Grocery Store is stopped printing on the console");
		
	}		
	
	
}