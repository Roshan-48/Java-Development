class RecReverse 
{
	public static void main(String[] args) 
	{
		reverse(1234,0);
	}
	public static void reverse(int num, int rev){
		if(num!=0){
			rev = rev*10+(num%10);
			reverse(num/10,rev);
		}
		else if(num==0)
			System.out.println(rev);
		return;
	}
}
