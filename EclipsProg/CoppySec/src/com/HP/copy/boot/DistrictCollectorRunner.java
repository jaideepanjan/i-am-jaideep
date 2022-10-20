package com.HP.copy.boot;

import com.HP.copy.thing.*;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		DistricCollector nam = new DistricCollector();
		DistricCollector age = new DistricCollector();
		DistricCollector dst = new DistricCollector();
		DistricCollector bno = new DistricCollector();

		System.out.println(nam.name);
		System.out.println(age.age);
		System.out.println(dst.district);
		System.out.println(bno.batchnumber);
		nam.name = "Jagadeesh Allagi";
		age.age = 25;
		dst.district = "Bijapur";
		bno.batchnumber = 6;
		System.out.println(nam.name);
		System.out.println(age.age);
		System.out.println(dst.district);
		System.out.println(bno.batchnumber);

		dst.district = "Bangloor";

		System.out.println("updated district is : "+dst.district);

	}

}
