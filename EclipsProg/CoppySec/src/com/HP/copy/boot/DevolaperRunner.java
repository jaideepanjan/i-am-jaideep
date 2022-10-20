package com.HP.copy.boot;
import com.HP.copy.thing.*;

public class DevolaperRunner {

	public static void main(String[] args) {
		Devolaper nam=new Devolaper();
		Devolaper edu=new Devolaper();
		Devolaper exp=new Devolaper();
		Devolaper sal=new Devolaper();
		Devolaper cmp=new Devolaper();
		
		System.out.println(nam.name);
		System.out.println(edu.education);
		System.out.println(exp.experience);
		System.out.println(sal.salary);
		System.out.println(cmp.company);
		
		nam.name="Jaideep";
		edu.education="Graduated";
		exp.experience="Two years";
		sal.salary=25000;
		cmp.company="IBM";
		
		System.out.println(nam.name);
		System.out.println(edu.education);
		System.out.println(exp.experience);
		System.out.println(sal.salary);
		System.out.println(cmp.company);
		
		cmp.company="PUMA";
		System.out.println("updated company:"+cmp.company);

	}

}
