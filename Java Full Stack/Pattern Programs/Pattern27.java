import java.util.Scanner;
class Pattern27 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++)
		{
			for(int space=0;space<n-1-i;space++)
				System.out.print("  ");
			for(int star=0;star<=2*i;star++)
				System.out.print("*"+" ");
			System.out.println();
		}
	}
}
