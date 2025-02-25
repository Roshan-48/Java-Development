import java.util.Scanner;
class LargestDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int max = 0;
		for (int i=num;i>0;i/=10)
		{
			int rem = i % 10;
			if(max<rem)
				max=rem;
		}
		System.out.println("Largest digit from the "+num+" is "+max);
	}
}
