import java.util.Scanner;
class Area
{
	public static void main(String[] args) 
	{
		final double pi = 22.0/7.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius: ");
		double r = sc.nextDouble();
		double result = pi * (r * r);
		System.out.println("The Area of circle is: "+result);
	}
}
