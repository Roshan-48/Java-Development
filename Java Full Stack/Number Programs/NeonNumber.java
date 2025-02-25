import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		int sqr = num*num;
		for(int i=sqr;i>0;i/=10)
			sum += (i%10);
		System.out.println(sum==num?num+" is Neon Number":num+" is not Neon Number");
	}
}
