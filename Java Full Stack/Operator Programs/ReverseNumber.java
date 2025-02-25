class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int dup = num;
		int rev = 0;

		int rem = num % 10;		// 123%10  -> 3(rem)
		rev = rev * 10 + rem;	// 0*10+3  -> 3(rev)

		num = num / 10;			// 123/10	-> 12(num)
		rem = num % 10;			//12%10		-> 2(rem)
		rev = rev * 10 + rem;	// 3*10+2	-> 32(rev)

		num = num / 10;			//12/10		-> 1(num)
		rem = num % 10;			//1%10		-> 1(rem)
		rev = rev * 10 + rem;	// 32*10+1	-> 321(rev)

		System.out.println(dup+" : "+rev);
	}
}
