package typeCasting;

public class FighterPlane extends Aeroplane{
	int gen;
	int seat;
	int range;
	String type;
	String refuel;
	
	public FighterPlane() {
		
	}

	public FighterPlane(String brand, double price, int engines, int year, int fuelCap, int speed, int wt, int cap,
			int gen, int seat,int range, String type, String refuel) {
		super(brand, price, engines, year, fuelCap, speed, wt, cap);
		this.gen = gen;
		this.seat = seat;
		this.range = range;
		this.type = type;
		this.refuel = refuel;	
	}
	
	public void displayFighterPlane() {
		displayAeroplane();
		System.out.println(gen);
		System.out.println(seat);
		System.out.println(range);
		System.out.println(type);
		System.out.println(refuel);
	}
}
