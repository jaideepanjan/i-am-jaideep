package com.hp.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {

	public static void main(String[] args) {
		String watch1="Apple";
		String watch2="Sonata";
		String watch3="Titan";
		String watch4="Fastrack";
		String watch5="Boat";
		String watch6="One Plus";
		String watch7="Amul";
		
		Collection<String> kaiGadiyara=new ArrayList<String>();
		
		kaiGadiyara.add(watch7);
		kaiGadiyara.add(watch6);
		kaiGadiyara.add(watch5);
		kaiGadiyara.add(watch4);
		kaiGadiyara.add(watch3);
		kaiGadiyara.add(watch2);
		kaiGadiyara.add(watch1);
		
		Iterator<String> itr=kaiGadiyara.iterator();
		
		while(itr.hasNext()) {
		    String element=itr.next();
		    System.out.println(element);
		}	

	}

}
