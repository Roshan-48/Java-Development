import java.util.Scanner;
class Months 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the three character of the month name: ");
		String month = sc.next();
		String op = (month.equals("OCT"))||(month.equals("NOV"))||
					(month.equals("DEC"))||(month.equals("JAN"))?("Winter"):
					(month.equals("FEB"))||(month.equals("MAR"))||
					(month.equals("APR"))||(month.equals("MAY"))?("Summer"):
					(month.equals("JUN"))||(month.equals("JUL"))||
					(month.equals("AUG"))||(month.equals("SEP"))?("Monsoon"):
					("Invalid Month");
		System.out.println(op);
	}
}
