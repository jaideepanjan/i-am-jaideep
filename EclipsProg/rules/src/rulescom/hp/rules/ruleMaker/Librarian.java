package rulescom.hp.rules.ruleMaker;

import rulescom.hp.rules.bridge.LibrabyRules;

public class Librarian {
	
	private LibrabyRules libRule1;
	
	public Librarian() {
		System.out.println("Running the Librarian default constructer");
	}
	
	public Librarian(LibrabyRules libRule1) {
		this.libRule1=libRule1;		
	}
	
	public void libFacility() {
		if(this.libRule1!=null) {
			System.out.println("Running Library Facility");
			boolean issue = this.libRule1.registerUrName();
			boolean scilence = this.libRule1.maintainScielence();
			if(issue==true&&scilence==false) {
				System.out.println("Readers following the Rules");
			}
			else {
				System.out.println("Readers not following Rules");
			}
		}
	}
	
	

}
