import java.util.Scanner;
class AreaPeriCircle 
{
	public static void main(String[] args) 
	{
		float radius;
		final float PI = 22.0f/7.0f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius: ");
		radius = sc.nextFloat();
		float area = PI*radius*radius;
		float perimeter = 2.0f*PI*radius;

		System.out.println("Area of Circle is: "+area+" sqcm");
		System.out.println("Perimeter of Circle is: "+perimeter);
	}
}
