package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.FevGod;
import rulescom.hp.rules.followers.Ganesh;
import rulescom.hp.rules.followers.God;
import rulescom.hp.rules.followers.Shiva;

public class GodRunner {

	public static void main(String[] args) {
		
		FevGod fevGod=new FevGod();
		System.out.println(fevGod.blessings());
		System.out.println(fevGod.creater());
		System.out.println(fevGod.power());
		System.out.println(fevGod.vehicle());
		System.out.println(fevGod.weapon());
		System.out.println("-------------------------------");
		
		
		God god=new FevGod();
		System.out.println(god.blessings());
		System.out.println(god.creater());
		System.out.println(god.equals(god));
		System.out.println(god.hashCode());
		System.out.println(god.power());
		System.out.println(god.toString());
		System.out.println(god.getClass());
		System.out.println("--------------------------------");
		
		Shiva shiva=new FevGod();
		
		System.out.println(shiva.blessings());
		System.out.println(shiva.creater());
		System.out.println(shiva.power());
		System.out.println(shiva.weapon());
		System.out.println(shiva.equals(shiva));
		System.out.println(shiva.hashCode());
		System.out.println(shiva.toString());
		System.out.println(shiva.getClass());
		System.out.println("----------------------------------");
		
		Ganesh ganesh=new FevGod();
		
		System.out.println(ganesh.blessings());
		System.out.println(ganesh.creater());
		System.out.println(ganesh.equals(ganesh));
		System.out.println(ganesh.hashCode());
		System.out.println(ganesh.power());
		System.out.println(ganesh.toString());
		System.out.println(ganesh.vehicle());
		System.out.println(ganesh.weapon());
		System.out.println(ganesh.getClass());
		System.out.println("-------------------------------------");

	}

}
