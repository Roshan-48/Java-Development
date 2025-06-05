package inheritance;

class Aeroplane{
	String brand;
	double price;
	int engines;
	int year;
	int fuelCap;
	int speed;
	int wt;
	int cap;
	
	public Aeroplane() {
		
	}

	public Aeroplane(String brand, double price, int engines, int year, int fuelCap, int speed, int wt, int cap) {
		super();
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.year = year;
		this.fuelCap = fuelCap;
		this.speed = speed;
		this.wt = wt;
		this.cap = cap;
	}
	
	public void displayAeroplane() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(engines);
		System.out.println(year);
		System.out.println(fuelCap);
		System.out.println(speed);
		System.out.println(wt);
		System.out.println(cap);
	}
}


class FighterPlane extends Aeroplane{
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

class Sukhoi extends FighterPlane{
	String model;
	int years;
	String weapons;
	String country;
	String service;
	
	public Sukhoi() {
		
	}

	public Sukhoi(String brand, double price, int engines, int year, int fuelCap, int speed, int wt, int cap, int gen,
			int seat, int range, String type, String refuel,String model, int years, String weapons, String country, String service) {
		super(brand, price, engines, year, fuelCap, speed, wt, cap, gen, seat, range, type, refuel);
		this.model = model;
		this.years = years;
		this.weapons = weapons;
		this.country = country;
		this.service = service;
	}
	
	public void displaySukhoi() {
		displayFighterPlane();
		System.out.println(model);
		System.out.println(years);
		System.out.println(weapons);
		System.out.println(country);
		System.out.println(service);
	}
}

public class MultiLevelInheritanceEx3 {

	public static void main(String[] args) {
		Sukhoi s1 = new Sukhoi("Sukhoi",5317244000.0,2,2000,1200,2,38800,38800,4,2,3000,"Multi role","Air to Air","Su30 MKI",12,"28 OFAB 250kg Bombs","Russia","India");
		s1.displaySukhoi();
	}
}
