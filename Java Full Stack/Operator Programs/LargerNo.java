import java.util.Scanner; 
class LargerNo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("The largest no among three numbers are: "+lar);
	}
}
