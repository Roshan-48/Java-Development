import java.util.Scanner;
class Pattern20
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();
		char ch = 'a';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch+" ");
				ch++;

			}
			System.out.println();
		}
	}
}
