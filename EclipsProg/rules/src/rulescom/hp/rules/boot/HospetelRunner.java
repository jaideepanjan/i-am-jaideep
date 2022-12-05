package rulescom.hp.rules.boot;

import rulescom.hp.rules.followers.Readers;
import rulescom.hp.rules.followers.Visitors;
import rulescom.hp.rules.ruleMaker.HospetalManagemnt;
import rulescom.hp.rules.ruleMaker.Librarian;

public class HospetelRunner {

	public static void main(String[] args) {
		Visitors visitors=new Visitors();
		
		HospetalManagemnt hospetalManagemnt=new HospetalManagemnt(visitors);
		hospetalManagemnt.visitorfollow();

	}

}
