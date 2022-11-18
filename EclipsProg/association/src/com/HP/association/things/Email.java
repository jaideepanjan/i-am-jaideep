package com.HP.association.things;

public class Email {
	public int id;
	public String password;
	public long mobNum;
	public Companyy companyy;
	
	
	public Email(int id, String password, long mobNum) {
		super();
		this.id = id;
		this.password = password;
		this.mobNum = mobNum;
	}
	public void setCompanyy(Companyy companyy) {
		this.companyy=companyy;
	}
	public void printMadu() {
		System.out.println("Email id : "+this.id);
		System.out.println("Email password : "+this.password);
		System.out.println("Given mobile number : "+this.mobNum);
		 if(this.companyy!=null) {
			 this.companyy.printMadu();
		 }
	}

}
