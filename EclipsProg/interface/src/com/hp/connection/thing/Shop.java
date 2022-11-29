package com.hp.connection.thing;

public interface Shop {
	
	boolean payingGST(int gstNo);
	long licenceNo(boolean );
	boolean govtPermition();
	String shopName();
	String type();

}
