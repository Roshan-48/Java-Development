package objectClass;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1 = new Student("Raju","FC College",1234,"BE","IT");
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println("----------------------------------------------");
		
//		Student s2 = new Student("Rani","Modern College",3456,"BTech","CSE");
		Student s2 = new Student("Raju","FC College",1234,"BE","IT");
		System.out.println(s2);
		System.out.println(s2.toString());
		System.out.println("----------------------------------------------");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
