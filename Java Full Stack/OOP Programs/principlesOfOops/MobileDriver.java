package principlesOfOops;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung","S 21",35000.0,"5G");
		m1.displayMobile();
		
		m1.insertSim("Jio","5G","Prepaid",9860017548l);
		m1.s.displaySim();
	}
}
