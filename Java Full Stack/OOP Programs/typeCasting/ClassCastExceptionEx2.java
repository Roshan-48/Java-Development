package typeCasting;

public class ClassCastExceptionEx2 {
	public static void main(String[] args) {
		Aeroplane a = new Aeroplane();
		FighterPlane f = (FighterPlane)a;
	}
}




//Sukhoi s1 = new Sukhoi("Sukhoi",5317244000.0,2,2000,1200,2,38800,38800,4,2,3000,"Multi role","Air to Air","Su30 MKI",12,"28 OFAB 250kg Bombs","Russia","India");
//s1.displaySukhoi();