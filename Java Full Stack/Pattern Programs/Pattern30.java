import java.util.Scanner;
class Pattern30
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();
		int star=1, space=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
				System.out.print(" "+" ");
			for(int j=0;j<star;j++)
				System.out.print("*"+" ");	//Add 2 more spaces then it will give diamond pattern with spaces bet stars
			System.out.println();
			if(i<n/2){
				space--;
				star++;
			}
			else{
				space++;
				star--;
			}
			
		}
	}
}
