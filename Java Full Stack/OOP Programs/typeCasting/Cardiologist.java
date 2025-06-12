package typeCasting;

public class Cardiologist extends Doctor{
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