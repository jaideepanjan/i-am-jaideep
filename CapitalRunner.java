class CapitalRunner{
	
	public static void main(String...m)
	{
		String state1="Karnataka";
		String ref0=Capital.getCapitalByState(state1);
		System.out.println(ref0);
		String ref1=Capital.getCapitalByState("Andrapradesh");
		System.out.println(ref1);
		
	}
}