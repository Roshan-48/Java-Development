import java.util.Scanner;
class ArmstrongPractice 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int len = 0;
		int sum = 0;
		for(int i=num;i>0;i/=10)
			len++;
		
		for(int j=num;j>0;j/=10){
			int rem = j%10;
			int pow =1;
			for(int k=1;k<=len;k++)
				pow *= rem;
			sum += pow;
		}
		System.out.println(sum==dup?dup+" is a Armstrong Number":dup+" is not a Armstrong Number");
	}
}
