class ColorsRunner
{
	public static void main(String...b)
	{
		System.out.println("Colors started Execution");
		Colors.save("Black");
		Colors.save("Red");
		Colors.save("Pink");
		Colors.save("Gray");
		Colors.save("Blue");
		Colors.save("Purpul");
		Colors.save("Yellow");
		Colors.display();
		Colors.checkColor("Gray");
	}
}