package com.hp.access.things;

public class Dominos {
	private String location;
	public String founder;
	public int since;
	public int noOfStores;
	public String AreaServed;
	public String service;
	public String type;
	public String website;
	public String chairman;
	public double netIncome;
	public double totalAssets;
	
	public Dominos(String founder, int since, int noOfStores, String areaServed, String service, String type,
			String website, String chairman, double netIncome, double totalAssets) {
		
		super();
		this.founder = founder;
		this.since = since;
		this.noOfStores = noOfStores;
		AreaServed = areaServed;
		this.service = service;
		this.type = type;
		this.website = website;
		this.chairman = chairman;
		this.netIncome = netIncome;
		this.totalAssets = totalAssets;
	}
	public String getLocation() {
		return location;
	}
	 void setLocation(String location) {
		this.location = location;
	}
	
	

}
