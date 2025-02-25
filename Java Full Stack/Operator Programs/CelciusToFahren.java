import java.util.Scanner;
class CelciusToFahren 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in a Degree Celcius: ");
		double degreeCel = sc.nextDouble();
		double fahren = (9.0/5.0)*degreeCel + 32;
		System.out.println(+degreeCel+" Celcius is "+fahren+" Fahrenheit");
	}
}
