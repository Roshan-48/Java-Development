import java.util.Scanner;
class Example 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String op = (num%2==0 && num%5==0)?("HiTwoHIFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):(" ")));
		System.out.println(op);
	}
}
