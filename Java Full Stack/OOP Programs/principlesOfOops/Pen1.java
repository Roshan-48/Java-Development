package principlesOfOops;

public class Pen1 {
	private String type;
	private String brand;
	private double price;
	private String color;
	
	public Pen1(String type, String brand, double price, String color) {
		super();
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public void displayPen1() {
		System.out.println("Pen Brand : "+brand);
		System.out.println("Pen Type : "+type);
		System.out.println("Pen Price : "+price);
		System.out.println("Pen Color : "+color);
		System.out.println();
	}
}
