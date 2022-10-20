package com.HP.Default.boot;
import com.HP.Default.thing.*;

public class TeaRunner {

	public static void main(String[] args) {
		Tea name = new Tea();
		name.name ="Kannan Devan";
		System.out.println("The name of the Tea : "+name.name);
		Tea brand = new Tea();
		brand.brand="TATA";
		System.out.println("The Tea Brand is : "+brand.brand);
		Tea type = new Tea();
		type.type="Clasic";
		System.out.println("Tea type is : "+type.type);
		Tea netWaight = new Tea();
		netWaight.netWaight=500;
		System.out.println("The Net Weight is : "+netWaight.netWaight +"g");
		Tea color = new Tea();
		color.colour="Brown";
		System.out.println("The colour of Tea is : "+color.colour);
		Tea manDate = new Tea();
		manDate.manufactureDate=26072022;
		System.out.println("Manufacturing Date is : "+manDate.manufactureDate);
		Tea expd =new Tea();
		expd.expairedate=23072023;
		System.out.println("Expaire date of tea poeder : "+expd.expairedate);
		Tea prise = new Tea();
		prise.prise=69.5;
		System.out.println("Prise of tea for 500g : "+prise.prise + "Rs");
		Tea natural =new Tea();
		natural.natural=true;
		System.out.println("Tea content is natural : "+natural.natural);
		Tea licno = new Tea();
		licno.licno=1001121025;
		System.out.println("Licence number is : "+licno.licno);
		Tea email = new Tea();
		System.out.println("Email ID : "+email.email);
		Tea location = new Tea();
		System.out.println("Production Location : "+location.location);
		Tea pinCode = new Tea();
		System.out.println("Pin Code : "+pinCode.pinCode);
		Tea tollFreeNum = new Tea();
		System.out.println("Toll Free Number : "+tollFreeNum.tollFreeNumber);
		Tea pacColor = new Tea();
		System.out.println("Colour of the container pack : "+pacColor.packetColour);
		Tea typeOfCont = new Tea();
		System.out.println("The container thpe : "+typeOfCont.typeOfContainer);
		Tea contFarm = new Tea();
		System.out.println("Form of the Container : "+contFarm.containerFarm);
		Tea flavor = new Tea();
		System.out.println("Flaver of the Tea : "+flavor.flavor);
		Tea organic = new Tea();
		System.out.println("The Tea powder is Organic : "+organic.organic);
		Tea countryOfOrigin = new Tea();
		System.out.println("Country of Origin of Tea Brand is : "+countryOfOrigin.countryOfOrigin);
		
	
	}

}
