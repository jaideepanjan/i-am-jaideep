package com.hp.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {


		String Animal1="Dog";
		String Animal2="Horse";
		String Animal3="Elephant";
		String Animal4="Camal";
		String Animal5="Mouse";
		String Animal6="Cat";
		String Animal7="Cow";
		String Animal8="Got";
		String Animal9="Tiger";
		String Animal10="Lion";
		
		Collection<String> pranigalu=new ArrayList<String>();
		
		pranigalu.add(Animal10);
		pranigalu.add(Animal9);
		pranigalu.add(Animal8);
		pranigalu.add(Animal7);
		pranigalu.add(Animal6);
		pranigalu.add(Animal5);
		pranigalu.add(Animal4);
		pranigalu.add(Animal3);
		pranigalu.add(Animal2);
		pranigalu.add(Animal1);
		
		Iterator<String> itr=pranigalu.iterator();
		
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
		

	}

}
