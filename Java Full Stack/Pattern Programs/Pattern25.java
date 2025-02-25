import java.util.Scanner;
class Pattern25
{
	public static void main(String[] args) 
	{    
		System.out.print("Enter the number: ");
		int n = new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-1);j++)
				System.out.print("");
			for(int j=1;j<=i;j++)
				System.out.print("* "+" ");
			System.out.println();
		}
	}
}

