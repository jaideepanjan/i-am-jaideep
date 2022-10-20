package com.hp.copy.thing;

public class Cake {
	
	public String nameOfTheBekery;
	public int price;
	public boolean eggLess;
	public boolean taste;
	public float custermerReview;
	public String[] flevers;
	public String[] colours;
	public String[] names;
	public String[] shapes;
	public String[] ingredints;
	public String[] qualityes;
	
	public Cake(String nameOfTheBekery,int price,boolean eggLess,boolean taste,float custermerReview,String[] flevers,String[] colours,String[] names,String[] shapes,String[] ingredints,String[] qualityes)
	{
		System.out.println("Parameterised constructor of Class Cake");
		this.nameOfTheBekery=nameOfTheBekery;
		this.price=price;
		this.eggLess=eggLess;
		this.taste=taste;
		this.custermerReview=custermerReview;
		this.flevers=flevers;
		this.colours=colours;
		this.names=names;
		this.shapes=shapes;
		this.ingredints=ingredints;
		this.qualityes=qualityes;
	}
	public void enterDetails() {

		
		System.out.println("Name of the bakery : "+this.nameOfTheBekery);
		System.out.println("Price ofvthe cake : "+this.price+"RS per KG");
		System.out.println("Is cake is Eggless : "+this.eggLess);
		System.out.println("Is tast is good : "+this.taste);
		System.out.println("Custemer review about cake : "+this.custermerReview);
		System.out.println("Cake Flevers : "+this.flevers);
		System.out.println("Cake colours : "+this.colours);
		System.out.println("Cake Names : "+this.names);
		System.out.println("Cake Shapes : "+this.shapes);
		System.out.println("Ingredints used to make a cake : "+this.ingredints);
		System.out.println(""+this.qualityes);
		
		System.out.println("loop of elements");
		
		for (int i = 0; i < this.flevers.length; i++) {
			String flevers = this.flevers[i];
			System.out.println(flevers);
			
		}
		for (int i = 0; i < this.colours.length; i++) {
			String colours = this.colours[i];
			System.out.println(colours);
			
		}
		for (int i = 0; i < this.names.length; i++) {
			String names = this.names[i];
			System.out.println(names);
			
		}
		for (int i = 0; i < this.shapes.length; i++) {
			String shapes = this.shapes[i];
			System.out.println(shapes);
			
		}
		for (int i = 0; i < this.ingredints.length; i++) {
			String ingredints = this.ingredints[i];
			System.out.println(ingredints);
			
		}
		for (int i = 0; i < this.qualityes.length; i++) {
			String qualityes = this.qualityes[i];
			System.out.println(qualityes);
			
		}

		
			
	
	}
	
}
