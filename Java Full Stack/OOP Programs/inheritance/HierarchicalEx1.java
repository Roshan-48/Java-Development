package inheritance;

class Doctor{
	String name;
	double fees;
	String degree;
	int exp;
	String hospital;
	
	public Doctor() {
		
	}
	Doctor(String name, double fees, String degree, int exp, String hospital){
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
	}
	public void displayDoctor() {
		System.out.println(name);
		System.out.println(fees);
		System.out.println(degree);
		System.out.println(exp);
		System.out.println(hospital);
	}
}

class Cardiologist extends Doctor{
	String spl;
	String organ;
	public Cardiologist() {
		
	}
	Cardiologist(String name, double fees, String degree, int exp, String hospital, String spl, String organ){
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
		this.spl = spl;
		this.organ = organ;
	}
	public void displayCardiologist() {
		displayDoctor();
		System.out.println(spl);
		System.out.println(organ);
	}
}

class Neurologist extends Doctor{
	String spl;
	String organ;
	public Neurologist() {
		
	}
	Neurologist(String name, double fees, String degree, int exp, String hospital, String spl, String organ){
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
		this.spl = spl;
		this.organ = organ;
	}
	public void displayNeurologist() {
		displayDoctor();
		System.out.println(spl);
		System.out.println(organ);
	}
}

class Orthopedics extends Doctor{
	String spl;
	String organ;
	public Orthopedics() {
		
	}
	Orthopedics(String name, double fees, String degree, int exp, String hospital, String spl, String organ){
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
		this.spl = spl;
		this.organ = organ;
	}
	public void displayOrthopedics() {
		displayDoctor();
		System.out.println(spl);
		System.out.println(organ);
	}
}


public class HierarchicalEx1 {

	public static void main(String[] args) {
		Cardiologist c1 = new Cardiologist("Roshan",300,"MBBS",3,"Sahyadri Hospital","MD(Cardio)","Heart");
		c1.displayCardiologist();
		System.out.println("-------------------------------------------------------");
	
		Neurologist n1 = new Neurologist("Raju",800,"MBBS",4,"Poona Hospital","MD(Neurology)","Brain");
		n1.displayNeurologist();
		System.out.println("-------------------------------------------------------");
		
		Orthopedics o1 = new Orthopedics("Sanju",1000,"MBBS",5,"Leelavati Hopital","MD(Ortho)","Bones");
		o1.displayOrthopedics();
	}

}
