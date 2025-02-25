import java.util.Scanner;
class Pattern1 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int n = new Scanner(System.in).nextInt();				
		for(int i=0; i<n;i++){
			for(int j=0; j<n; j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}
