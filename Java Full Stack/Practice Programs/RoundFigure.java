import java.util.Scanner;
class RoundFigure
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(num%5==0)
			System.out.println(num);
		else
		{
			while(num%5!=0)
				num--;
			System.out.print(num);  
		}
	}
}

