import java.util.Scanner;
class DecreasingNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Number : ");
		int num = new Scanner(System.in).nextInt();
		int flag = 1 ;
		while(num>=10)
		{
			
				if((num%10)>((num/10)%10))
				{
					flag=0;
					break;
				}			
			num/=10;
		}
		if(flag==0)
			System.out.println("It is not Decreasing Number");
		else
			System.out.println("It is an Decreasing Number");
	}
}