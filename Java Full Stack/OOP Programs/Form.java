class Form 
{
	String name;
	long phno;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;
	Form(){
		
	}
	Form(String name,long phno,char gen,String dob){
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
	}
	Form(String name,long phno,char gen,String dob,long tel){
		this(name,phno,gen,dob);
		this.tel = tel;
	}
	Form(String name,long phno,char gen,String dob,long tel,String blood, String email){
		this(name,phno,gen,dob,tel);
		this.blood = blood;
		this.email = email;
	}

	public void displayForm(){
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phno);
		System.out.println("Gender: "+gen);
		System.out.println("DOB: "+dob);
		System.out.println("Telephone: "+tel);
		System.out.println("Blood "+blood);
		System.out.println("Email: "+email);
	}
}
