import java.util.Scanner;
class Pattern19
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();

		for(int i=1;i<=n;i++){
			char ch = 'a';
			for(int j=1;j<=i;j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
