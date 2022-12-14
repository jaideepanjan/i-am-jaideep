package com.hp.ecception.boot;

import com.hp.ecception.followers.JavaTrainee;
import com.hp.ecception.followers.Person;
import com.hp.ecception.followers.Vijayalakshmi;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person=new JavaTrainee();
		person.setName("Jaideep");
		person.setHeight(5.3);
		person.setGender('M');
		person.setColour("Brown");
		
		System.out.println(person.getName());
		System.out.println(person.getHeight());
		System.out.println(person.getGender());
		System.out.println(person.getColour());
		
		person.eat();
		person.Sleep();
		
		System.out.println("---------------------------------------");
		
		JavaTrainee javaTrainee=new JavaTrainee();
		javaTrainee.setName("Agraja");
		javaTrainee.setHeight(5.68);
		javaTrainee.setGender('M');
		javaTrainee.setColour("White");
		
		System.out.println(javaTrainee.getName());
		System.out.println(javaTrainee.getHeight());
		System.out.println(javaTrainee.getGender());
		System.out.println(javaTrainee.getColour());
		
		javaTrainee.completedProgram();
		javaTrainee.eat();
		javaTrainee.Sleep();
		javaTrainee.training();
		javaTrainee.uplodedTask();
		
		System.out.println("---------------------------------------");
		
		Vijayalakshmi vijayalakshmi=new Vijayalakshmi();
		vijayalakshmi.eat();
		

	}

}
