package com.HP.copy.boot;
import com.HP.copy.thing.*;

public class BreadRunner {

	public static void main(String[] args) {
		
		Bread bread=new Bread();
		System.out.println(bread);
		
		Bread bread1=new Bread("Rye","Amul");
		System.out.println("Type of the Bread : "+bread1.type);
		System.out.println("Shape of the Bread : "+bread1.shape);
		System.out.println("Prise of the Bread : " +bread1.price+"Rs");
		System.out.println(" Good Quality : "+bread1.quality);
		System.out.println("Name of the Company : "+bread1.companyName);
		
		

	}

}
