package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.College;

public class CollegeRunner {

	public static void main(String[] args) {
		
		College college=new College();
		System.out.println(college.apron());
		System.out.println(college.grooming());
		System.out.println(college.idcard(0));
		System.out.println(college.intime());
		System.out.println(college.uniform(null));
		
   
	}

}
