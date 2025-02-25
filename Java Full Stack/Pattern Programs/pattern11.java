import java.util.Scanner;
class Pattern11 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++)
				System.out.print("*"+" ");
			System.out.println();
		}		
	}
}
