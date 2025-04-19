//This is the example of both composition and aggregation

package principlesOfOops;

//import java.util.Iterator;

class Mobile2{
	private String brand;
	private String model;
	private double price;
	private String color;
	private Processor1 ps;
	private Battery1 b1 = new Battery1("MOTO","Lithium ION",3200,"19/04/2025",11,68);
	
	private SimCard [] simcards = new SimCard[2];
	private HeadPhone headphone;
	private Charger charger;
	private int indx;
	
	public Mobile2(String brand, String model, double price, String color, Processor1 ps) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.ps = ps;
	}
	
	public void displayMobile() {
		System.out.println("Mobile Brand : "+brand);
		System.out.println("Mobile Model : "+model);
		System.out.println("Mobile Price : "+price);
		System.out.println("Mobile Color : "+color);
	}

	public Processor1 getPs() {
		return ps;
	}

	public Battery1 getB1() {
		return b1;
	}
	
	public SimCard[] getSimcards() {
		return simcards;
	}

	public HeadPhone getHeadphone() {
		return headphone;
	}
	
	public Charger getCharger() {
		return charger;
	}

	public void addSimCard(String serviceProvider, String networkType, String type, long number) {
		SimCard sim = new SimCard(serviceProvider, networkType, type, number);
		simcards[indx] = sim;
		indx++;
		System.out.println("Sim Card Inserted");
	}
	
	public void addHeadPhone(String brand, String type, double driver, double price) {
		headphone = new HeadPhone(brand,type,driver,price);
		System.out.println("Headphone Added!");
	}
	
	public void addCharger(String type, double power, String brand) {
		charger = new Charger(type,power,brand);
		System.out.println("Charger Added!");
	}
}

class Processor1{
	private String type;
	private double clockSpeed;
	private String networkType;
	private int ram;
	private int rom;
	private OperatingSystem1 os;
	
	public Processor1(String type, double clockSpeed, String networkType, int ram, int rom) {
		super();
		this.type = type;
		this.clockSpeed = clockSpeed;
		this.networkType = networkType;
		this.ram = ram;
		this.rom = rom;
		this.os = new OperatingSystem1("Android","15.5.1",8,"19/04/2025");
	}
	
	public void displayProcessor() {
		System.out.println("Processor Type : "+type);
		System.out.println("Processor ClockSpeed : "+clockSpeed);
		System.out.println("Processor Network Type : "+networkType);
		System.out.println("Processor RAM : "+ram);
		System.out.println("Processor ROM : "+rom);
	}

	public OperatingSystem1 getOs() {
		return os;
	}
	
}

class OperatingSystem1{
	private String name;
	private String version;
	private double memoryConsum;
	private String releaseDate;
	
	public OperatingSystem1(String name, String version, double memoryConsum, String releaseDate) {
		super();
		this.name = name;
		this.version = version;
		this.memoryConsum = memoryConsum;
		this.releaseDate = releaseDate;
	}
	
	public void displayOperatingSystem() {
		System.out.println("Operating System Name : "+name);
		System.out.println("Operating System Version : "+version);
		System.out.println("Operating System Memory : "+memoryConsum);
		System.out.println("Operating System Release Date : "+releaseDate);
	}
}

class Battery1{
	private String brand;
	private String type;
	private double capacity;
	private String manufDate;
	private int hours;
	private int power;
	
	public Battery1(String brand, String type, double capacity, String manufDate, int hours, int power) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
		this.manufDate = manufDate;
		this.hours = hours;
		this.power = power;
	}
	
	public void displayBattery() {
		System.out.println("Battery Brand : "+brand);
		System.out.println("Battery Type : "+type);
		System.out.println("Battery Capacity : "+capacity);
		System.out.println("Battery Manufacturing date : "+manufDate);
		System.out.println("Battery Hours: "+hours);
		System.out.println("Battery Power : "+power);
		
	}
}

class SimCard{
	private String serviceProvider;
	private String networkType;
	private String type;
	private long number;
	
	public SimCard(String serviceProvider, String networkType, String type, long number) {
		super();
		this.serviceProvider = serviceProvider;
		this.networkType = networkType;
		this.type = type;
		this.number = number;
	}
	
	public void displaySimCard() {
		System.out.println("Sim card ServiceProvider : "+serviceProvider);
		System.out.println("Sim card Network Type : "+networkType);
		System.out.println("Sim card Type : "+type);
		System.out.println("Sim card Number : "+number);
	}
}

class HeadPhone{
	private String brand;
	private String type;
	private double driver;
	private double price;
	
	public HeadPhone(String brand, String type, double driver, double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.driver = driver;
		this.price = price;
	}
	
	public void displayHeadPhone() {
		System.out.println("HeadPhone Brand : "+brand);
		System.out.println("HeadPhone Type : "+type);
		System.out.println("HeadPhone Driver : "+driver);
		System.out.println("HeadPhone Price : "+price);
	}
}

class Charger{
	private String type;
	private double power;
	private String brand;
	
	public Charger(String type, double power, String brand) {
		super();
		this.type = type;
		this.power = power;
		this.brand = brand;
	}
	
	public void displayCharger() {
		System.out.println("Charger Type : "+type);
		System.out.println("Charger Power : "+power);
		System.out.println("Charger Brand : "+brand);
	}
}

public class MobileCreation {
	public static void main(String[] args) {
		Processor1 ps = new Processor1("Dual Core",2.5,"6G",12,512);
		Mobile2 m = new Mobile2("Motoroala","Edge 50 Pro", 30000, "Black",ps);
		m.displayMobile();
		m.getPs().displayProcessor();
		m.getPs().getOs().displayOperatingSystem();
		m.getB1().displayBattery();
		m.addSimCard("Airtel","5G","Prepaid",9860017548l);
		m.addSimCard("Jio","6G","Postpaid",9226775085l);
		for (SimCard ele : m.getSimcards()) {
			ele.displaySimCard();
        }
		m.addCharger("MoTo", 68,"Type-c");
		m.getCharger().displayCharger();
		m.addHeadPhone("Noise","Wireless",15.1,1000);
		m.getHeadphone().displayHeadPhone();
	}
}
