import java.util.Scanner;
class BMICal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		float a = sc.nextFloat();
		System.out.print("Enter height in inches: ");
		float b = sc.nextFloat();
		double weight = a*0.45359237;
		double height = b*0.0254;

		double BMI = weight / (height*height);
		System.out.println("BMI is: "+BMI);

	}
}
