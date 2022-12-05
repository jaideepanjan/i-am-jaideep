package rulescom.hp.rules.ruleMaker;

import rulescom.hp.rules.bridge.HospetalRules;

public class HospetalManagemnt {
	
	private HospetalRules visitor;
	
	public HospetalManagemnt() {
		System.out.println("Running Hospetal Managemnt rules");
	}
	
	public HospetalManagemnt(HospetalRules visitor) {
		this.visitor=visitor;		
	}
	
	public void visitorfollow() {
		if(this.visitor!=null) {
			System.out.println("Running Vistor Rules");
			boolean mask = this.visitor.wearMask();
			boolean smooking = this.visitor.noSmooking();
			if(mask==true&&smooking==true) {
				System.out.println("Readers following the Rules");
			}
			else {
				System.out.println("Readers not following Rules");
			} 
		}
	}

}
