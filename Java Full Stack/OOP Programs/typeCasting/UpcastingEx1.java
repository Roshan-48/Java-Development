package typeCasting;

public class UpcastingEx1 {

	public static void main(String[] args) {

		Doctor d = new Cardiologist("Roshan",300,"MBBS",3,"Sahyadri Hospital","MD(Cardio)","Heart");	//UpCasting
		d.displayDoctor();
		System.out.println("-------------------------------------------------------");
		Doctor d1 = new Neurologist("Raju",800,"MBBS",4,"Poona Hospital","MD(Neurology)","Brain");	//UpCasting
		d1.displayDoctor();	
	}
}