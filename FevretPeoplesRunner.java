class FevretPeoplesRunner{
	public static void main(String...f){
		FevretPeoples.save("Sneha");
		FevretPeoples.save("Jagdeesh");
		FevretPeoples.save("Prashanth");
		FevretPeoples.save("Kiran");
		FevretPeoples.save("Vrgeesk");
		FevretPeoples.save("Shahish");
		FevretPeoples.save("Raksha");
		FevretPeoples.save("Manjunath");
		FevretPeoples.save("Aadi");
		FevretPeoples.save("Sandesh");
		FevretPeoples.display();
		FevretPeoples.find("Sneha");
		FevretPeoples.update("Vargeesh","Dude");
		FevretPeoples.update1(2,"Agraja");
		FevretPeoples.delete("Kiran");
		FevretPeoples.delete1(5,"Bhai");
		
	}
}