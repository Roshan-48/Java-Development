class FascinatingNumber1 
{
	public static void main(String[] args) 
	{
		int num = 192;			//192,219,273,327
		int temp = num;
		boolean flag = true;
		for(int i=2;i<=3;i++){
			num = (num*1000)+(temp*i);
		}
		for(int i=1;i<=9;i++){
			int cnt = 0;
			for(int j=num;j>0;j/=10){
				int rem = j%10;
				if(rem==i)
					cnt++;
			}
			if(cnt!=1){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(temp+" is Fascinating Number");
		else
			System.out.println(temp+" is not Fascinating Number");
	}
}
