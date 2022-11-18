package com.HP.association.things;

public class Job {
	public float salary;
	public String roll;
	public boolean bond;
	public Companyy companyy;
	
	
	public Job(float salary, String roll, boolean bond) {
		super();
		this.salary = salary;
		this.roll = roll;
		this.bond = bond;
	}
	public void setCompany(Companyy companyy) {
		this.companyy=companyy;
	}
	public void printMadu() {
		System.out.println("Salary of the job : "+salary +"LPA");
		System.out.println("Job roll : "+roll);
		System.out.println("Isn't Bond is there : "+bond);
	if(this.companyy!=null) {
		this.companyy.printMadu();
	}
	}
	

}
