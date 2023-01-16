package com.xworkz.initialize.been;

import java.util.Collection;
//import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ex {

	public static void main(String[] args) {
		
		
		Map<String, Double> map= new TreeMap<>((a,b)-> b.compareTo(a));
		map.put("hi", 11D);
		map.put("bye", 2D);
		map.put("see u", 8D);
		map.put("seek u", 8D);

		
		Set<String> ref=map.keySet();
		System.out.println(ref.size());
		
		Collection<Double> ref1=map.values();
		System.out.println(ref1.size());
		
		Set<Entry<String, Double>> re2=map.entrySet();
		System.out.println(re2);
		
		map.forEach((e1,e2)-> System.out.println("keys= "+e1+" ,values ="+e2));
		
		Double ref3=map.replace("take care", 2D);
		System.out.println(ref3);
		map.forEach((x,y)-> System.out.println(x+""+y));
		


	}

}
