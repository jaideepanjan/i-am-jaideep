package com.xworkz.morningClass.object;

public class ODICricket extends Cricket {
	
	private String groundName;
	
	public ODICricket() {
		System.out.println("running no-arg cons in ODICricket");
	}

	public ODICricket(String groundName) {
		super();
		this.groundName = groundName;
	}
	
	public String getGroundName() {
		return "Kanteerava Stadeum";
	}
	
	

}
