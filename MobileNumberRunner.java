class MobileNumberRunner{
	public static void main(String...mn)
	{
		long number1=6366504207L;
		String ref=MobileNumber.getNameByMobileNumber(number1);
		System.out.println("Name is Enterde "+ref);
		String ref1=MobileNumber.getNameByMobileNumber(9945983508L);
		System.out.println("Name is Enterde "+ref1);
		String ref2=MobileNumber.getNameByMobileNumber(7411833326L);
		System.out.println("Name is Enterde "+ref2);
		String ref3=MobileNumber.getNameByMobileNumber(7259646525L);
		System.out.println("Name is Enterde "+ref3);
	}
}