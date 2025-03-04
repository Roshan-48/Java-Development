class RecCount 
{
	public static void main(String[] args) 
	{
		System.out.println(count(12348,0));
	}
	public static int count(int num, int ct){
		if(num==0)
			return ct;
		return count(num/10, ++ct);
		//return num == 0?ct:count(num/10,++ct);
	}
}
