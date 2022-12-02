package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Love;

public class LoveRunner {

	public static void main(String[] args) {
		
		Love love=new Love();
		System.out.println(love.caring());
		System.out.println(love.humble());
		System.out.println(love.love());
		System.out.println(love.sharing());
		System.out.println(love.truthFull());

	}

}
