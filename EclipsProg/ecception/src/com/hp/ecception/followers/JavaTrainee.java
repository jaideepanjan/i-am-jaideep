package com.hp.ecception.followers;

import com.hp.ecception.bridge.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule {
	
	public String training() {
		return null;
	}

	@Override
	public boolean uplodedTask() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean completedProgram() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void executeProgram() {
		System.out.println("Running Execute Program method");
	}

}
