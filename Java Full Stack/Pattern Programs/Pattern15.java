import java.util.Scanner;
class Pattern15 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();
		int num = 1;
		for (int i=1;i<=n;i++)
		{
			int start = num + i - 1; 
            for (int j = start; j >= num; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            num += i;
		}
	}
}
