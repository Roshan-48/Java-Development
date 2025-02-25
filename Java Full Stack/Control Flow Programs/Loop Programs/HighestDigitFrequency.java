import java.util.Scanner;
class HighestDigitFrequency 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		long num =sc.nextLong();
		int max = 0; 
		int dgt = 0;
		for(int i=0;i<=9;i++)
		{
			int cnt = 0;
			for(long j=num;j>0;j/=10)
			{
				long rem = j%10;
				if(i==rem)
					cnt++;
			}
			if(cnt!=0){
				if(max<cnt){
					max = cnt;
					dgt = i;
				}
			}
		}
		System.out.println("max digit is "+dgt+" with a fre of "+max);
	}
}
   