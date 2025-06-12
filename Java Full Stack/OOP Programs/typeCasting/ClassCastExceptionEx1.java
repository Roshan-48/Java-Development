package typeCasting;

public class ClassCastExceptionEx1 {
	
	public static void main(String[]args) {
		Father f = new Son1();		//UpCasting
		Son s = (Son)f;				//ClassCastException
		s.smoking();
	}
}
