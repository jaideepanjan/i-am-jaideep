package com.HP.Default.boot;
import com.HP.Default.thing.*;

public class RmdRunner {

	public static void main(String[] args) {
		Rmd owName = new Rmd();
		owName.ownerName ="R S Munirathinam";
		System.out.println("The owner and Chairman of RMD : " +owName.ownerName);
		Rmd prise = new Rmd();
		prise.prise =15;
		System.out.println("The prise of RMD : " +prise.prise +"Rs");
		Rmd fulFarm = new Rmd();
		fulFarm.fulFarm ="R S Munirathinam";
		System.out.println("Full Farm of RMD : " +fulFarm.fulFarm);
		Rmd whSlPr = new Rmd();
		whSlPr.wholeSalePrise =21.71;
		System.out.println("The owner and Chairman of RMD : " +whSlPr.wholeSalePrise+"$");
		Rmd sideEffect = new Rmd();
		sideEffect.sideEffect =true;
		System.out.println("Is it cause side effect : " +sideEffect.sideEffect);
		Rmd tobacoFree = new Rmd();
		tobacoFree.tobacoFree =true;
		System.out.println("The owner and Chairman of RMD : " +tobacoFree.tobacoFree);
		Rmd tOBl = new Rmd();
		tOBl.typeOfBlend ="Premium";
		System.out.println("The type of Blend : " +tOBl.typeOfBlend);
		Rmd pinCod = new Rmd();
		pinCod.pincode =411001;
		System.out.println("Pin Code of address : " +pinCod.pincode);
		Rmd location = new Rmd();
		System.out.println("Location of the manufacturing place : " +location.location);
		Rmd madeIn = new Rmd();
		System.out.println("TheProdect Made in : " +madeIn.madeIn);
		Rmd email = new Rmd();
		System.out.println("The Email ID of company : " +email.email);
		Rmd website = new Rmd();
		System.out.println("The RMD website : " +website.website);
		Rmd copyWrite = new Rmd();
		System.out.println("About Copy Write : " +copyWrite.copyWrite);
		Rmd packageType = new Rmd();
		System.out.println("The Product packaging type : " +packageType.packageType);
		
	}

}
