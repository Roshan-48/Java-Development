import java.util.Scanner;
class Pattern26
{
	public static void main(String[] args) 
	{    
		System.out.print("Enter the number: ");
		int n = new Scanner(System.in).nextInt();
		for(int i=n;i>=n;i--){
			for(int j=1;j<=(n-i);j++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}