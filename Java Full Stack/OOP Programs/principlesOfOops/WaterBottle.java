package principlesOfOops;

public class WaterBottle {
	private String material;
	private String brand;
	private int capacity;
	private double price;
	
	public WaterBottle(String material, String brand, int capacity, double price) {
		super();
		this.material = material;
		this.brand = brand;
		this.capacity = capacity;
		this.price = price;
	}
	
	public void displayWaterBottle() {
		System.out.println("Bottle Material : "+material);
		System.out.println("Bottle Brand : "+brand);
		System.out.println("Bottle Capacity : "+capacity);
		System.out.println("Bottle Price : "+price);
		System.out.println();
	}
}
