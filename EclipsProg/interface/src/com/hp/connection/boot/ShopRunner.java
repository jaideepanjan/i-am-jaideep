package com.hp.connection.boot;

import com.hp.connection.interfaces.ShopOwner;

public class ShopRunner {

	public static void main(String[] args) {
		ShopOwner shopOwner=new ShopOwner();
		shopOwner.payingGST(true);
		shopOwner.govtPermition();
		shopOwner.licenceNo();
		shopOwner.shopName();
		shopOwner.type();
		System.out.println("Running Shop Runner");
		
		
       
	}

}
