class Student 
{
	String name;
	int age;
	String coll;
	String degree;
	int roll;

	Student()
	{
		System.out.println("From no args constructor");
		System.out.println(this);
	}

	Student(String name,int age,String coll,String degree,int roll){
		this.name = name;
		this.age = age;
		this.coll = coll;
		this.degree = degree;
		this.roll = roll;
	}
	public void displayStudent(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(coll);
		System.out.println(degree);
		System.out.println(roll);
	}	

}
