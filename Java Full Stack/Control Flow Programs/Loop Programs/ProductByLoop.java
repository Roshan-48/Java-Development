import java.util.Scanner;
class ProductByLoop  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int dup = num;
		int product = 1;

		while(num>0)
		{
			int rem = num%10;
			product *= rem;
			num /= 10;
		}
		System.out.println(product);
		System.out.println(dup);
	}
}