import java.util.Scanner;
class Pattern18 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();
		int a = 1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}
