import java.util.Scanner;
class MinutesToYears
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minutes: ");
		long min = sc.nextLong();
		long minYears = 365*24*60;
		long years = min/minYears;
		long days = (min % minYears) / (24*60);
		
		System.out.println("User Entered Min: "+min);
		System.out.println(years +" years " + days +" days");
	}
}