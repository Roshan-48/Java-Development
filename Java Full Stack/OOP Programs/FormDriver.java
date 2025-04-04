class FormDriver 
{
	public static void main(String[] args) 
	{
		Form f1 = new Form();
		f1.displayForm();
		
		Form f2 = new Form("Raju",9860017548l,'M',"04/08/2003");
		f2.displayForm();

		Form f3 = new Form("Rani",9226775085l,'F',"03/04/2002",144673748l,"O+","rani@gmail.com");
		f3.displayForm();
	}
}
