import java.util.Scanner;
class EvenOddDigitProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int EvenProduct = 1;
		int OddProduct = 1;
		int temp = 0;
		int rem = num % 10;
		temp = (rem % 2 == 0)? (EvenProduct = EvenProduct * rem) : (OddProduct = OddProduct * rem);
		
		num= num / 10;		
		rem = num % 10;
		temp = (rem % 2 == 0)? (EvenProduct = EvenProduct* rem) : (OddProduct = OddProduct* rem);

		num= num / 10;		
		rem = num % 10;
		temp = (rem % 2 == 0)? (EvenProduct = EvenProduct * rem) : (OddProduct = OddProduct * rem);

		num= num / 10;		
		rem = num % 10;
		temp = (rem % 2 == 0)? (EvenProduct = EvenProduct * rem) : (OddProduct = OddProduct * rem);

		System.out.println("Even Digits Product: "+EvenProduct);
		System.out.println("Odd Digits Products: "+OddProduct);
	}
}
