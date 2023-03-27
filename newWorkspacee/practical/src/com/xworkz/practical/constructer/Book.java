package com.xworkz.practical.constructer;

public class Book {
	
	private String name;
	private double price;
	private char size;
	private String poetryName;
	
	public Book() {
		System.out.println("Running no-agr constructer of Book class");
	}

	public Book(String name, double price, char size, String poetryName) {
		
		this.name = name;
		this.price = price;
		this.size = size;
		this.poetryName = poetryName;
	}
	
	public void read() {
		
		System.out.println("Readin books is good hobby");
		
		System.out.println("About the book is : "+this.name);
		System.out.println("About the book is : "+this.poetryName);
		System.out.println("About the book is : "+this.size);
		System.out.println("About the book is : "+this.price);
		
	}


	
	

}
