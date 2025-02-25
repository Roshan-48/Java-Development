import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Cylinder: ");
		float radius = sc.nextFloat();
		System.out.print("Enter height of Cylinder: ");
		float height = sc.nextFloat();

		float area = (22.0f/7.0f)*radius*radius;
		float volume = area*height;
		System.out.println("The area is: "+area);
		System.out.println("The volume is: "+volume);
	}
}
