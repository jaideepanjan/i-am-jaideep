package com.hp.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {
		String shoeSize1="4";
		String shoeSize2="4.5";
		String shoeSize3="5";
		String shoeSize4="6";
		String shoeSize5="7";
		String shoeSize6="8";
		String shoeSize7="9";
		String shoeSize8="10";
		String shoeSize9="8.5";
		String shoeSize10="5.8";
		String shoeSize11="8.9";
		String shoeSize12="11";
		String shoeSize13="14";
		String shoeSize14="12";
		String shoeSize15="13";
		
		Collection<String> slipper=new ArrayList<String>();
		
		slipper.add(shoeSize1);
		slipper.add(shoeSize2);
		slipper.add(shoeSize3);
		slipper.add(shoeSize4);
		slipper.add(shoeSize5);
		slipper.add(shoeSize6);
		slipper.add(shoeSize7);
		slipper.add(shoeSize8);
		slipper.add(shoeSize9);
		slipper.add(shoeSize10);
		slipper.add(shoeSize11);
		slipper.add(shoeSize12);
		slipper.add(shoeSize13);
		slipper.add(shoeSize14);
		slipper.add(shoeSize15);
		
		Iterator<String> itr=slipper.iterator();
		
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}

	}

}
