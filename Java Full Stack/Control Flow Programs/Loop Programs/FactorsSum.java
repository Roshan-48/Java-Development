import java.util.Scanner;
class FactorsSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		System.out.println("Factors: ");
		for(int i=2;i<num;i++)
			if(num%i==0){
				System.out.print(i+" ");
				sum += i;
		}
		System.out.println();
		System.out.println("Factors sum of number: "+sum);
	}
}
