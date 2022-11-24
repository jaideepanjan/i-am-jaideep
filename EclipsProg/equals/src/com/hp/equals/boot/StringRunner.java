package com.hp.equals.boot;

public class StringRunner {

	public static void main(String[] args) {
		
		String name="Jaideep";
		System.out.println(name);
		name=name+"1711";
		System.out.println(name);
		String concated=name.concat("Joy");
		System.out.println(concated);
		System.out.println("...........................");
		
		int agraja = concated.charAt(22);
		System.out.println(agraja);
		System.out.println("............................");
		
		int amma=concated.codePointAt(7);
		System.out.println(amma);
		System.out.println(".............................");
		
		boolean appa=name.contains(concated);
		System.out.println(appa);
		System.out.println("................................");
		
		int geleya=name.codePointBefore(agraja);
		System.out.println(geleya);
		System.out.println(".................................");
		
		int dosta=concated.codePointCount(amma, geleya);
		System.out.println(dosta);
		System.out.println("...............................");
		
		int peddu=name.compareTo(concated);
		System.out.println(peddu);
		System.out.println("................................");
		
		int pappu=name.compareToIgnoreCase(concated);
		System.out.println(pappu);
		System.out.println(".................................");
		
		boolean sista=name.contentEquals(concated);
		System.out.println(sista);
		System.out.println("..............................");
		
		boolean puppy=concated.contentEquals(concated);
		System.out.println(puppy);
		System.out.println("...............................");
		
		byte[] dada=concated.getBytes();
		System.out.println(dada);
		System.out.println("...................................");
		
		byte[] honey=concated.getBytes();
		System.out.println(honey);
		System.out.println("...................................");
		
		byte[] kush=concated.getBytes();
		System.out.println(kush);
		System.out.println("...................................");
		
		int smart=concated.hashCode();
		System.out.println(smart);
		System.out.println("................................");
		
		int shree=name.indexOf(1);
		System.out.println(shree);
		System.out.println("..............................");
		
		int goshal=name.indexOf(concated);
		System.out.println(goshal);
		System.out.println("................................");
		
		int guruji=name.indexOf(shree, goshal);
		System.out.println(guruji);
		System.out.println(".................................");
		
		String gubbi=name.intern();
		System.out.println(gubbi);
		System.out.println(".................................");
		
		boolean achhu=name.isEmpty();
		System.out.println(achhu);
		System.out.println("..............................");
		
		int gombe=name.length();
		System.out.println();
		System.out.println("..................................");
		
		boolean bangari=concated.matches(concated);
		System.out.println(bangari);
		System.out.println(".................................");
		
		String muddu=concated.replace("my", "life");
		System.out.println(muddu);
		System.out.println("..................................");
		
		String[] bhabi=name.split("agraja");
		System.out.println(bhabi);
		System.out.println(".................................");
		
		String gigi=concated.toUpperCase();
		System.out.println(gigi);
		System.out.println(".................................");
		
		String captain=concated.trim();
		System.out.println(captain);
		System.out.println(".............................");
		
		String darling=concated.toLowerCase();
		System.out.println(darling);
		System.out.println("............................");
		
		

	}

}
