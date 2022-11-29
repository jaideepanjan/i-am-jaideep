package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Marrage;

public class MarrageRunner {

	public static void main(String[] args) {
		Marrage marrage=new Marrage();
		
		System.out.println(marrage.agree());
		System.out.println(marrage.preWeddingShoot());
		System.out.println(marrage.major(0));
		System.out.println(marrage.taken(null));
		System.out.println(marrage.job(null));

	}

}
