class Shoe
{
	String brand = "Reebok";
	double price;
	int size;
	String color;
	String type;

	{
		System.out.println("Non Static block starts");
		if(brand.charAt(0)=='N')
			price = 1000.0;
		else
			price = 500;
		
		displayShoe();
		System.out.println("Non Static Block ends");
	}
	Shoe()
	{	
	}

	Shoe(double price, int size, String type, String color){
		System.out.println("Constructor block starts");
		this.price = price;
		this.size = size;
		this.type = type;
		this.color = color;

		System.out.println("Constructor block ends");
	 }
	 public void displayShoe(){
		System.out.println(brand);
		System.out.println(price);
		System.out.println(size);
		System.out.println(color);
		System.out.println(type);
	 }
}