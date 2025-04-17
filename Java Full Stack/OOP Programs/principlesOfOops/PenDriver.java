//Early Instantiation of Has-A relationship

package principlesOfOops;

public class PenDriver {
	public static void main(String[]args) {
		Pen p1 = new Pen("Reynolds",10,"Ball Pen", "Blue",0.5, "Ball Point");
		p1.displayPen();
		p1.rf.displayRefill();
		System.out.println("-------------------------------------------");
		
		Pen p2 = new Pen("Rorito",15,"Gel Pen", "Blue",0.7, "Gel Point");
		p2.displayPen();
		p2.rf.displayRefill();
	}
}
