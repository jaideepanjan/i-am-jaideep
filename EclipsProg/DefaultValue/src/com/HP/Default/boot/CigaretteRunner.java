package com.HP.Default.boot;
import com.HP.Default.thing.*;

public class CigaretteRunner {

	public static void main(String[] args) {
		Cigarette name = new Cigarette();
		name.name="Gold Flake";
		System.out.println("Nmae of the Cigeratte : "+name.name);
		Cigarette brand = new Cigarette();
		brand.brand="ITC";
		System.out.println("Brand : "+brand.brand);
		Cigarette mnDate = new Cigarette();
		mnDate.manufactureDate=27082022;
		System.out.println("Date of Manufacture : "+mnDate.manufactureDate);
		Cigarette compNme = new Cigarette();
		compNme.companyName="G S Global Ventures Pvt. Ltd";
		System.out.println("Nmae of the Cigeratte : "+compNme.companyName);
		Cigarette loc = new Cigarette();
		loc.location="Chennai";
		System.out.println("product manufacture at : "+loc.location);
		Cigarette prise = new Cigarette();
		prise.prise=100;
		System.out.println("Prise of a pack : "+prise.prise+"Rs");
		Cigarette no = new Cigarette();
		no.noOfCig=10;
		System.out.println("Number of Cigeratte in a pack : "+no.noOfCig);
		Cigarette mail = new Cigarette();
		mail.eMailID="qma@itc.in";
		System.out.println("Email ID of the company : "+mail.eMailID);
		Cigarette made = new Cigarette();
		System.out.println("Product made in : "+made.madeIn);
		Cigarette blend = new Cigarette();
		System.out.println("Blend of the Cigeratte : "+blend.blend);
		Cigarette tpOfCont = new Cigarette();
		System.out.println("Type of Container : "+tpOfCont.typeOfContainer);
		Cigarette aOfH = new Cigarette();
		System.out.println("Causes any Health Affect  : "+aOfH.CauseHealthEffect);
		Cigarette effect = new Cigarette();
		System.out.println("Causes Cancer : "+effect.effect);
		Cigarette tFrNo = new Cigarette();
		System.out.println("Toll Free Number : "+tFrNo.tOlFrNum);
		Cigarette lcNo = new Cigarette();
		System.out.println("Product Lisence Number : "+lcNo.lisenceNum);
		Cigarette pacCol = new Cigarette();
		System.out.println("Product pack Colour : "+pacCol.packColour);
		
	}

}
