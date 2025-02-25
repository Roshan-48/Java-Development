import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Operand1: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter Operand2: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter Operator: ");
		char ch = sc.next().charAt(0);
		double op = 0;

		op = (ch=='+')?num1+num2:
			(ch=='-')?num1-num2:
			(ch=='*')?num1*num2:
			(ch=='/')?num1/num2:
			(ch=='%')?num1%num2:0.000001f;

		String output = num1+" "+ch+" "+num2+" = "+op;

		if(!(op==0.000001f))
			System.out.println(output);

	}
}
