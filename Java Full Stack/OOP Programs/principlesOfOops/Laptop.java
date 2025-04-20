package principlesOfOops;

public class Laptop {
	private String brand;
	private String model;
	private double price;
	
	public Laptop(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void displayLaptop() {
		System.out.println("Laptop brand : "+brand);
		System.out.println("Laptop Model : "+model);
		System.out.println("Laptop Price : "+price);
		System.out.println();
	}
}
