import java.util.Scanner;
class Series1
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the characters: ");
		String str = new Scanner(System.in).next().toUpperCase();
		int op = 0;
		char ch = str.charAt(0);
		if(str.length()>2){
			System.out.println("Invalid String");
			return;
		}
		op = (ch-64);
		if(str.length()==2){
			char ch1 = str.charAt(1);
			op = (op*26)+(ch1-64);
		}
		System.out.println(str+" : "+op);
	}
}
