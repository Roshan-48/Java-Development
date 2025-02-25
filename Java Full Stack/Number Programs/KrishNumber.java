import java.util.Scanner;
class KrishNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=num;i>0;i/=10)
		{
			int rem = i%10;
			int fact = 1;
			for(int j=1;j<=rem;j++)
				fact*=j;
			sum += fact;
		}
		System.out.println(num==sum?"KRISH Number":"Not KRISH Number");
	}
}
