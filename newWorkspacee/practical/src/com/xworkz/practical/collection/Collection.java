package com.xworkz.practical.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Collection {
	
	public static void main(String[] args) {
		
	List<String> name=new ArrayList<String>();
	
	name.add("Bun");
	name.add("Chaco");
	name.add("Icecreame");
	name.add("Dark Fantasy");
	name.add("Burbon");
	name.add("Kesari");
	name.add("Cake");
	
	
	
List<String> name1=new ArrayList<String>();
	
	name1.add("Choose");
	name1.add("The");
	name1.add("Correct");
	name1.add("Option");
	name1.add("Cake");
	name1.add("Chaco");
	

		List<String> names= new ArrayList<>();
		
		names.addAll(name);
		names.addAll(name1);
		
		for(String dup:names) {
			System.out.println(dup);
			
		}
		
		Iterator<String> filter= names.iterator();
		
		while(filter.hasNext()) {
			String string=(String)filter.next();
			int a=0;
			StringBuffer sb=new StringBuffer(string);
			sb.reverse();
			String str=sb.toString();
			if(string.equals(str)) {
				a++;
				System.out.println("Paliendrome : "+sb);
			}
			
		}
		
		
	
	}
	
	
	 

}
