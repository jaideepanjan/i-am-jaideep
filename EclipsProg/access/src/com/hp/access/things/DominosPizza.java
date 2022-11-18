package com.hp.access.things;

public class DominosPizza {
	
	public String name;
	public Dominos dominos=new Dominos("James Monaghan",1960,17000,"Worldwide","Food delivery","dominos.com","David A. Brandon",491.296,1.567 ) ;
	
	public void callDominosPizza() {
		System.out.println(this.name);
		if(this.dominos!=null) {
			System.out.println("Fully qualified name : "+this.dominos);
			System.out.println("Founder of Dominos : "+this.founder);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

}
