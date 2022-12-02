package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Factory;
import rulescom.hp.rules.followers.FactoryRules;

public class FactoryRunner {

	public static void main(String[] args) {
		Factory factory=new Factory();
		System.out.println(factory.intime());
		System.out.println(factory.shoes(null));
		System.out.println(factory.SRules(0));
		System.out.println(factory.uniform(null));
		System.out.println(factory.withSafetyEquipments());

	}

}
