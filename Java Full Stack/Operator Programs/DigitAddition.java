import java.util.Scanner;
class DigitAddition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Digit: ");
		int num = sc.nextInt();
		int sum = 0;

		int rem = num % 10;
		sum = sum + rem;
		num = num / 10;

		rem = num % 10;
		sum = sum + rem;
		num = num / 10;

		rem = num % 10;
		sum = sum + rem;
		num = num / 10;

		rem = num % 10;
		sum = sum + rem;
		num = num / 10;

		System.out.println(sum);

	}
}
