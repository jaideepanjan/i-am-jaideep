package com.hp.copy.thing;

public class Clothes {
	
	public String shopeName;
	public String price;
	public boolean offers;
	public boolean quality;
	public float custermerReview;
	public String[] types;
	public String[] colours;
	public String[] styles;
	public int[] sizeInNum;
	public String[] brands;
	public char[] sizesInChar;
	
	public Clothes(String shopeName,String price,boolean offers,boolean quality,float custermerReview,String[] types,String[] colours,String[] styles,int[] sizeInNum,String[] brands,char[] sizeInChar)
	{
		System.out.println("Parameterised constructor of Class Clothes");
		this.shopeName=shopeName;
		this.price=price;
		this.offers=offers;
		this.quality=quality;
		this.custermerReview=custermerReview;
		this.types=types;
		this.colours=colours;
		this.styles=styles;
		this.sizeInNum=sizeInNum;
		this.brands=brands;
		this.sizesInChar=sizesInChar;
	}
	public void enterDetails() {

		
		System.out.println("Name of the Shop : "+this.shopeName);
		System.out.println("Depends on clothes type and desigh"+this.price);
		System.out.println("Is offeres seasion : "+this.offers);
		System.out.println("Is Quality of clothes are good : "+this.quality);
		System.out.println("Custemer review about clothes : "+this.custermerReview);
		System.out.println("TYpes of clothes : "+this.types);
		System.out.println("Colours  availability : "+this.colours);
		System.out.println("Cake Names : "+this.styles);
		System.out.println("Clothes sizes in numbers : "+this.sizeInNum);
		System.out.println("Brands of clothes : "+this.brands);
		System.out.println("Clothes sizes in Charecter"+this.sizesInChar);
		
		System.out.println("loop of elements");
		
		for (int i = 0; i < this.types.length; i++) {
			String types = this.types[i];
			System.out.println(types);
			
		}
		for (int i = 0; i < this.colours.length; i++) {
			String colours = this.colours[i];
			System.out.println(colours);
			
		}
		for (int i = 0; i < this.styles.length; i++) {
			String styles = this.styles[i];
			System.out.println(styles);
			
		}
		for (int i = 0; i < this.sizeInNum.length; i++) {
			int sizeInNum = this.sizeInNum[i];
			System.out.println(sizeInNum);
			
		}
		for (int i = 0; i < this.brands.length; i++) {
			String brands = this.brands[i];
			System.out.println(brands);
			
		}
		for (int i = 0; i < this.sizesInChar.length; i++) {
			char sizesInChar = this.sizesInChar[i];
			System.out.println(sizesInChar);
			
		}

		
			
	
	}
	

}
