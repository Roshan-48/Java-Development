//Encapsulation Example

package principlesOfOops;

public class StudentDriver {
	public static void main(String[]args) {
		Student s1 = new Student("Roshan","Full Stack Java",30000.0,"Deccan",6.75,"BE",79.60,79.83,9860017548l);
		
		System.out.println(s1.getInstitute());
		System.out.println(s1.getUsername());
		System.out.println(s1.getCoursename());
		System.out.println(s1.getDegree());
		System.out.println(s1.getCGPA());
		System.out.println(s1.getFees());
		System.out.println(s1.getHSC());
		System.out.println(s1.getSSC());
		
		s1.setBranch(true,"Deccan");
		s1.setPhno(false,9860017548l);
		
		System.out.println(s1.getBranch());
		System.out.println(s1.getPhno());
		
	}
}
