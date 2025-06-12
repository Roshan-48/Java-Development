package typeCasting;

public class DownCastingEx1 {
	public static void main(String[]args) {
		Father f1 = new Son();			//UpCasting
		f1.drinking();
		
		Son s1 = (Son)f1;			//DownCasting
		s1.drinking();
		s1.smoking();
	}
}
