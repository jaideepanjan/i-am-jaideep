package com.hp.inheritance.thing.childClass;
import com.hp.inheritance.thing.Account;

public class SavingAccount extends Account {
	public String accountant; 
	public int balance;
	
	public SavingAccount() {
		System.out.println("Printing default constructer of Saving Account");
	}

}
