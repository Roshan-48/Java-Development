import java.util.Scanner;
class DigitsProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int product = 1;

		int rem = num % 10;
		product = product*rem;

		num = num/10;
		rem = num % 10;
		product = product*rem;

		num = num/10;
		rem = num % 10;
		product = product*rem;

		num = num/10;
		rem = num % 10;
		product = product*rem;

		System.out.println("The product of digits which is entered by user is: "+product);
	}
}
