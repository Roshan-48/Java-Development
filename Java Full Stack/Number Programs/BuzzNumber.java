import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Number: ");
		int n = new Scanner(System.in).nextInt();
		if(n%7==0||(n%10)==7)
			System.out.println(n+" is buzz Number");
		else
			System.out.println(n+" is not Buzz Number");
	}
}

