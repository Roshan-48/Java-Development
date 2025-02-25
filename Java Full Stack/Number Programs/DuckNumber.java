import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Number: ");
		String str = new Scanner(System.in).next();
		if(str.charAt(0)!='0' && str.contains("0"))
			System.out.print(str+" is a Duck Number");
		else
			System.out.print(str+" is not a Duck Number");
	}
}
