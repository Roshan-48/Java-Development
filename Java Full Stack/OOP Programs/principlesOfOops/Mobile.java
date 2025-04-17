package principlesOfOops;

public class Mobile {
	String brand;
	String name;
	double price;
	String type;
	Sim s;
	
	public Mobile() {
		
	}
	
	Mobile(String brand, String name, double price, String type){
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void displayMobile() {
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
		System.out.println("Mobile Created!");	
	}
	
	public void insertSim(String sp, String networkType, String simType, long simNo) {
		s = new Sim(sp,networkType,simType,simNo);
		System.out.println("Sim Inserted!");
		//Helper Method
	}
}
