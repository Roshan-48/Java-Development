import java.util.Scanner;
class TipCalculation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the bill: ");
		float bill = sc.nextFloat();
		System.out.print("Enter the tip rate: ");
		float tipRate = sc.nextFloat();

		float tipAmount = (bill*tipRate)/100;
		float totalBill = bill+tipAmount;
		System.out.println("totalBill is: "+ totalBill);
		System.out.println("Tip added is: "+tipAmount);
	}
}

