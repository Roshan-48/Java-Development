package principlesOfOops;

public class Refill {
	String color;
	double size;
	String type;
	
	public Refill() {
		
	}
	
	Refill(String color, double size, String type){
		this.color = color;
		this.size = size;
		this.type = type;
	}
	
	public void displayRefill() {
		System.out.println(color);
		System.out.println(size);
		System.out.println(type);
	}
}
