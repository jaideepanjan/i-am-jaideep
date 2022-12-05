package rulescom.hp.rules.boot;

import rulescom.hp.rules.followers.Readers;
import rulescom.hp.rules.ruleMaker.Librarian;

public class LibraryRunner {

	public static void main(String[] args) {
		
		Readers readers=new Readers();
		
		Librarian librarian=new Librarian(readers);
		librarian.libFacility();
	}

}
