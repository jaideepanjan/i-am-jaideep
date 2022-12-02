package rulescom.hp.rules.boot;

import rulescom.hp.rules.bridge.Friend;
import rulescom.hp.rules.followers.FriendRule;

public class FriendRunner {

	public static void main(String[] args) {
		
		Friend friend=new Friend();
		System.out.println(friend.beWithMe());
		System.out.println(friend.caring());
		System.out.println(friend.honest());
		System.out.println(friend.matchingColour());
		System.out.println(friend.naughty());

	}

}
