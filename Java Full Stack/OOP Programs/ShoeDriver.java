class ShoeDriver 
{
	public static void main(String[] args) 
	{
		Shoe s1 = new Shoe();
		s1.displayShoe();
		System.out.println("-------------------------------");
		
		Shoe s2 = new Shoe(3450.345,10,"Sports","Blue");
		s2.displayShoe();
	}
}
