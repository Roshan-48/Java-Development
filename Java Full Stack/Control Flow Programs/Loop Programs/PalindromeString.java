import java.util.Scanner;
class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		String rev ="";
		for (int i=0;i<str.length();i++)			
			rev = str.charAt(i) + rev;
		
		System.out.println((rev.equals(str))?"String is Palindrome":"String is not Palindrome"); 
	}
}