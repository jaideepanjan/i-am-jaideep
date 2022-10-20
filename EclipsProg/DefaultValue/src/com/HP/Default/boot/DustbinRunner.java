package com.HP.Default.boot;
import com.HP.Default.thing.*;

public class DustbinRunner {

	public static void main(String[] args) {
		
		Dustbin brand = new Dustbin();
		brand.brand = "AADGEX";
		System.out.println("The brand of Dustbin : "+brand.brand);
		Dustbin cap = new Dustbin();
		cap.capacity=14;
		System.out.println("apacity of the Dustbin : "+cap.capacity+"Lte");
		Dustbin col = new Dustbin();
		col.colour="Gray";
		System.out.println("Colour of the Dustbin : "+col.colour);
		Dustbin opMec = new Dustbin();
		opMec.operatingMechanisum="Automatic/sencer";
		System.out.println("Operating mechanisum : "+opMec.operatingMechanisum);
		Dustbin material = new Dustbin();
		material.material="Acrylonitrile Butadiene Styrene";
		System.out.println("The material madeup of : "+material.material);
		Dustbin spFe = new Dustbin();
		spFe.specialFeatute="With Sensor Pullout";
		System.out.println("Special feature of Dustbin : "+spFe.specialFeatute);
		Dustbin prise = new Dustbin();
		prise.prise=1799L;
		System.out.println("prise : "+prise.prise);
		Dustbin type = new Dustbin();
		type.type="Auto Operation";
		System.out.println("type of the Dustbin : "+type.type);
		Dustbin shape = new Dustbin();
		System.out.println("Shape of the Dustbin : "+shape.shape);
		Dustbin tyOfEncl = new Dustbin();
		System.out.println("Type of Encloser : "+tyOfEncl.typeOfEncloser);
		Dustbin star = new Dustbin();
		System.out.println("Stars Ratings of Quality : "+star.star);
		Dustbin made = new Dustbin();
		System.out.println("Product made in : "+made.madein);
		Dustbin moBoard = new Dustbin();
		System.out.println("Type of Motherboard used  : "+moBoard.motherBoard);
		Dustbin battery = new Dustbin();
		System.out.println("Type of Battery : "+battery.battery);
		Dustbin senTyp = new Dustbin();
		System.out.println("apacity of the Dustbin : "+senTyp.sencingType);
		Dustbin tpsOfMode = new Dustbin();
		System.out.println("apacity of the Dustbin : "+tpsOfMode.typesOfMode);
		

	}

}
