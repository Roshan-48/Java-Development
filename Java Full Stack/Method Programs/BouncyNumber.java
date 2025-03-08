class BouncyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(bouncy(112));
	}
	public static boolean bouncy(int num){
		boolean inc = false, dec = false;
		int last = num%10;
		num/=10;
		int secLast = num%10;
		
		while(num>0){
			if(last<secLast)
				inc = true;
			else if(last>secLast)
				dec = true;
			last = secLast;
			num/=10;
			secLast = num%10;
			
			if(inc && dec)
				break;
		}
		return inc && dec;
	}
}
