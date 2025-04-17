package principlesOfOops;

public class Pen {
	String brand;
	double price;
	String type;
	Refill rf;
	
	public Pen() {
		
	}
	
	public Pen(String brand, double price, String type, String color, double size, String refillType) {
		rf = new Refill(color,size,type);
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	
	public void displayPen() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(type);
	}
}
