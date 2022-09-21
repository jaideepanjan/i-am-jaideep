class Bike{
	static String [] names  ;
	static String [] color;	
	static String []companynames ;
	static byte [] durability ;
	static double [] width ;
	static double [] height ;
	static double [] weight ;
	static short [] rimsize ;
	static long [] price ;
	static int [] speed   ;
	static String [] material ;
	static String [] modelnames ;
	static char size ;
	static String strength;
	static boolean comfort ;
	static String stiffness ;
	static String type ;
	
	static void printProperties()
	{
		System.out.println(size);
		System.out.println(strength);
		System.out.println(comfort);
		System.out.println(strength);
		System.out.println(type);
		
		if(names!=null)
		{
			System.out.println("array is pointing to names adress");
			System.out.println("total names:"+color.length);
			for(int hesru=0;hesru<names.length;hesru++)
			{
				String nama=color[hesru];
				System.out.println(nama);
			}
		}
		else{
			System.out.println("array is not pointingto any names adress");
		}
		if(color!=null)
		{
			System.out.println("array is pointing to color adress");
			System.out.println("total color:"+color.length);
			for(int banna=0;banna<color.length;banna++)
			{
				String rangu=color[banna];
				System.out.println(rangu);
			}
		}
		else{
			System.out.println("array is not pointingto any color adress");
		}
		if(companynames!=null)
		{
			System.out.println("array is pointing to companynames adress");
			System.out.println("total companynames:"+companynames.length);
			for(int brands=0;brands<companynames.length;brands++)
			{
				String dolly=color[brands];
				System.out.println(dolly);
			}
		}
		else{
			System.out.println("array is not pointingto any companynames adress");
		}
		
		if(durability!=null)
		{
			System.out.println("array is pointing to durability adress");
			System.out.println("total durabilities:"+durability.length);
			for(int life=0;life<durability.length;life++)
			{
				String expected=color[life];
				System.out.println(expected);
			}
		}
		else{
			System.out.println("array is not pointingto any durability adress");
		}
		
		if(width!=null)
		{
			System.out.println("array is pointing to width adress");
			System.out.println("total width:"+width.length);
			for(int agala=0;agala<width.length;agala++)
			{
				String ref=color[agala];
				System.out.println(ref);
			}
		}
		else{
			System.out.println("array is not pointingto any width adress");
		}
		
		if(height!=null)
		{
			System.out.println("array is pointing to height adress");
			System.out.println("total height:"+height.length);
			for(int ettara=0;ettara<height.length;ettara++)
			{
				String akasha=color[ettara];
				System.out.println(akasha);
			}
		}
		else{
			System.out.println("array is not pointingto any height adress");
		}
		
		if(weight!=null)
		{
			System.out.println("array is pointing to weight adress");
			System.out.println("total weight:"+weight.length);
			for(int bhara=0;bhara<weight.length;bhara++)
			{
				String kgs=color[bhara];
				System.out.println(kgs);
			}
		}
		else{
			System.out.println("array is not pointingto any weight adress");
		}
		
		if(rimsize!=null)
		{
			System.out.println("array is pointing to rimsize adress");
			System.out.println("total rimsize:"+rimsize.length);
			for(int chakra=0;chakra<rimsize.length;chakra++)
			{
				String round=color[chakra];
				System.out.println(round);
			}
		}
		else{
			System.out.println("array is not pointingto any rimsize adress");
		}
		
		if(price!=null)
		{
			System.out.println("array is pointing to price adress");
			System.out.println("total price:"+price.length);
			for(int bele=0;bele<price.length;bele++)
			{
				String hana=color[bele];
				System.out.println(hana);
			}
		}
		else{
			System.out.println("array is not pointingto any price adress");
		}
		
		if(speed!=null)
		{
			System.out.println("array is pointing to speed adress");
			System.out.println("total speed:"+speed.length);
			for(int ota=0;ota<speed.length;ota++)
			{
				String fast=color[ota];
				System.out.println(fast);
			}
		}
		else{
			System.out.println("array is not pointingto any speed adress");
		}
		
		if(material!=null)
		{
			System.out.println("array is pointing to material adress");
			System.out.println("total material:"+material.length);
			for(int vasthu=0;vasthu<material.length;vasthu++)
			{
				String ref0=color[vasthu];
				System.out.println(ref0);
			}
		}
		else{
			System.out.println("array is not pointingto any material adress");
		}
		
		if(modelnames!=null)
		{
			System.out.println("array is pointing to modelnames adress");
			System.out.println("total modelnames:"+modelnames.length);
			for(int varients=0;varients<modelnames.length;varients++)
			{
				String style=color[varients];
				System.out.println(style);
			}
		}
		else{
			System.out.println("array is not pointingto any modelnames adress");
		}
		
		
			
	}
}