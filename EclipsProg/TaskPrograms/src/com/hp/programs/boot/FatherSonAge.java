package com.hp.programs.boot;
import java.util.Scanner;

public class FatherSonAge {

	public static void main(String[] args) {
		int father;
		int son ;
		 
		System.out.println("Enter the Father age and Son age ");
		
		Scanner sc = new Scanner(System.in);
		father = sc.nextInt();
		son = sc.nextInt();
		
		  if(father!=0&&son!=0)
		  {
			  double different = father - son;
			  System.out.println(System.lineSeparator());
			  System.out.println("Different between Father and Son Age is:"+different);
			  
		  }

	}

}
