import java.util.Scanner;
class Pattern7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				if(j==n/2||i==n/2||i==0&&j>n/2||j==0&&i<n/2||j==n-1&&i>n/2||i==n-1&&j<n/2||i==j||i+j==n-1)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}
