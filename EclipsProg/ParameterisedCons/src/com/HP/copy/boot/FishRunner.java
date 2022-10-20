package com.HP.copy.boot;
import com.HP.copy.thing.*;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		System.out.println(fish);
		Fish fish1 =new Fish("Betta",70);
		System.out.println(fish1.name);
		System.out.println(fish1.type);
		System.out.println(fish1.price+"Rs");
		System.out.println(fish1.weight+"grms");
		System.out.println(fish1.length);
		
		Fish fish2 =new Fish(2.25D,"Osphronemidae");
		System.out.println(fish2.name);
		System.out.println(fish2.type);
		System.out.println(fish2.price+"Rs");
		System.out.println(fish2.weight+"grms");
		System.out.println(fish2.length+" inches");
		
		Fish fish3 =new Fish(3,"Betta");
		System.out.println(fish3.name);
		System.out.println(fish3.type);
		System.out.println(fish3.price+"Rs");
		System.out.println(fish3.weight+"grms");
		System.out.println(fish3.length+" inches");
		
		Fish fish4 =new Fish("Osphronemidae",2.25D);
		System.out.println(fish4.name);
		System.out.println(fish4.type);
		System.out.println(fish4.price+"Rs");
		System.out.println(fish4.weight+"grms");
		System.out.println(fish4.length+" inches");
		
		Fish fish5 =new Fish(2.25D,3);
		System.out.println(fish5.name);
		System.out.println(fish5.type);
		System.out.println(fish5.price+"Rs");
		System.out.println(fish5.weight+"grms");
		System.out.println(fish5.length+" inches");
		
		Fish fish6 =new Fish("Betta","Osphronemidae");
		System.out.println(fish6.name);
		System.out.println(fish6.type);
		System.out.println(fish6.price+"Rs");
		System.out.println(fish6.weight+"grms");
		System.out.println(fish6.length+" inches");
		
		Fish fish7 =new Fish(3,70);
		System.out.println(fish7.name);
		System.out.println(fish7.type);
		System.out.println(fish7.price+"Rs");
		System.out.println(fish7.weight+"grms");
		System.out.println(fish7.length+" inches");
		
		Fish fish8 =new Fish(70,2.25D);
		System.out.println(fish8.name);
		System.out.println(fish8.type);
		System.out.println(fish8.price+"Rs");
		System.out.println(fish8.weight+"grms");
		System.out.println(fish8.length+" inches");
		
		

	}

}
