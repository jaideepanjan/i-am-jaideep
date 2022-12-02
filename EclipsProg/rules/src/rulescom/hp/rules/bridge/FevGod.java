package rulescom.hp.rules.bridge;

import rulescom.hp.rules.followers.Ganesh;
import rulescom.hp.rules.followers.God;
import rulescom.hp.rules.followers.Leela;
import rulescom.hp.rules.followers.Shiva;

public class FevGod implements God, Shiva, Leela,Ganesh {

	@Override
	public String vehicle() {
		System.out.println("Running vehicle");
		return null;
	}

	@Override
	public String weapon() {
		System.out.println("Running weapon");
		return null;
	}

	@Override
	public boolean blessings() {
		System.out.println("Running blessings");
		return false;
	}

	@Override
	public boolean creater() {
		System.out.println("Running creater");
		return false;
	}

	@Override
	public String power() {
		System.out.println("Running power");
		return null;
	}

}
