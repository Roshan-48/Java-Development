import java.util.Scanner;
class AreaPeriRectangle 
{
	public static void main(String[] args) 
	{
		float width,height;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a height: ");
		height = sc.nextFloat();
		System.out.print("Enter the width: ");
		width = sc.nextFloat();
		float area = height*width;
		float perimeter = 2*(height+width);
		System.out.println("Area of Ractangle: "+area+" sqcm");
		System.out.println("Perimeter of Rectangle: "+perimeter);
	}
}
