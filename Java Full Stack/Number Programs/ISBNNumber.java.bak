import java.util.Scanner;
class ISBNNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the NUmber: ");
		long num = sc.nextLong();
		int sum = 0;
		for (long i=num,j=1;i>0;i/=10,j++)
		{
			long rem = i%10;
			sum += (rem*j);
		}
		if(sum%11==0)
			System.out.println(num+" is valid ISBN Number");
		else
			System.out.println(num+" is not a valid ISBN Number");
	}
}
