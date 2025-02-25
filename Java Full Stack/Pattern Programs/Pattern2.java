import java.util.Scanner;
class Pattern2 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int n = new Scanner(System.in).nextInt();				
		for(int i=0; i<n-1;i++){
			for(int j=0; j<n; j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}
