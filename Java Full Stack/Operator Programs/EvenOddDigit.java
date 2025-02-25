import java.util.Scanner;
class EvenOddDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int EvenSum = 0;
		int OddSum = 0;
		int temp = 0;

		int rem = num % 10;
		temp = (rem % 2 == 0)? (EvenSum = EvenSum + rem) : (OddSum = OddSum + rem);
		
		num= num / 10;		
		rem = num % 10;
		temp = (rem % 2 == 0)? (EvenSum = EvenSum + rem) : (OddSum = OddSum + rem);

		num= num / 10;		
		rem = num % 10;
		temp = (rem % 2 == 0)? (EvenSum = EvenSum + rem) : (OddSum = OddSum + rem);

		num= num / 10;		
		rem = num % 10;
		temp = (rem % 2 == 0)? (EvenSum = EvenSum + rem) : (OddSum = OddSum + rem);

		System.out.println("Even Digits sum: "+EvenSum);
		System.out.println("Odd Digits sum: "+OddSum);
	}
}
