package com.hp.inheritance.boot;

import com.hp.inheritance.thing.Account;
import com.hp.inheritance.thing.childClass.SavingAccount;
import com.hp.inheritance.thing.childClass.CurrentAccount;
import com.hp.inheritance.thing.childClass.JointAccount;


public class AccountRunner {

	public static void main(String[] args) {
		Account account=new SavingAccount();
		System.out.println(account.branch);
		System.out.println(account.branchCode);
		System.out.println(account.ifscCode);
		SavingAccount savingAccount=(SavingAccount)account;
		System.out.println(savingAccount.accountant);
		System.out.println(savingAccount.balance);
		System.out.println("--------------------------");
		
		Account account2=new CurrentAccount();
		System.out.println(account.branch);
		System.out.println(account.branchCode);
		System.out.println(account.ifscCode);
		CurrentAccount currentAccount=(CurrentAccount) account2;
		System.out.println(currentAccount.accNumbre);
		System.out.println(currentAccount.email);
		System.out.println("--------------------------");
		
		Account account3=new JointAccount();
		System.out.println(account.branch);
		System.out.println(account.branchCode);
		System.out.println(account.ifscCode);
		JointAccount jointAccount=(JointAccount) account3;
		System.out.println(jointAccount.accountantsName);
		System.out.println(jointAccount.cifNo);
		System.out.println(jointAccount.address);
		System.out.println("--------------------------");
		
	}

}
