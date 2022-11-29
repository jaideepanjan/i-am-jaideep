package com.hp.connection.interfaces;

import com.hp.connection.thing.Shop;

public class ShopOwner implements Shop{

	@Override
	public boolean payingGST(boolean b) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public long licenceNo() {
		// TODO Auto-generated method stub
		return 12245662L;
	}

	@Override
	public boolean govtPermition() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String shopName() {
		// TODO Auto-generated method stub
		return "SMMS";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Tea stal";
	}
	
                          

}
