import java.util.Scanner;
class EYCompany 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the players: ");
		String s = sc.next();
		/*if(s.contains("0000000")||s.contains("1111111"))				//METHOD 1
			System.out.println("YES");
		else
			System.out.println("NO");*/

		int cnt1 = 0;												//METHOD 2
		int cnt0 = 0;
		for (int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='1')
				cnt1++;
			else if(ch=='0')
				cnt0++;
			else{
				cnt1 = 0;
				cnt0 = 0;
			}
			if(cnt1>=7 || cnt0>=7)
				break;
		}
		System.out.println(cnt1>=7 || cnt0>=7 ? "YES" : "NO");
	}
}

