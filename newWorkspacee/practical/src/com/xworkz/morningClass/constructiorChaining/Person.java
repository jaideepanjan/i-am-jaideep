package com.xworkz.morningClass.constructiorChaining;

public class Person {
	
	private int id;
	private String name;
	private int age;
	private String email;
	
	
	public Person() {
		System.out.println("Running no arg cond in person");	
		}
	
	public Person(int id, String name, int age, String email) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public Person(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	

}
