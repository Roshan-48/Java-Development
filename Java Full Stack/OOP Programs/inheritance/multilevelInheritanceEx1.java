package inheritance;

import java.util.*;

class University{
	private String name;
	private int code;
	private int collegesNumber;
	private ArrayList<String> course = new ArrayList<String>();
	private String director;
	private String address;
	private long contact;
	private String email;
	
	public University(){
		super();
	}
	
	public University(String name, int code, int collegesNumber, ArrayList<String> course, String director, String address,
			long contact, String email) {
		super();
		this.name = name;
		this.code = code;
		this.collegesNumber = collegesNumber;
		this.course = course;
		this.director = director;
		this.address = address;
		this.contact = contact;
		this.email = email;
	}
	
	public void displayUniversity() {
		System.out.println("University Name : "+name);
		System.out.println("University Code : "+code);
		System.out.println("University Colleges : "+collegesNumber);
		System.out.println("University Cousres : "+course);
		System.out.println("University Dean : "+director);
		System.out.println("University Address : "+address);
		System.out.println("University Contact : "+contact);
		System.out.println("University Email : "+email);
		System.out.println();
	}
}

class College extends University{
	private String collegeName;
	private int collegeCode;
	private String grade;
	private String principal;
	private int collegeStudents;
	private ArrayList<String> departments = new ArrayList<String>();
	private String collegeAddress;
	private String collegeEmail;
	
	public College(){
		super();
	}

	public College(String collegeName, int collegeCode, String grade, String principal, int collegeStudents,
			ArrayList<String> departments, String collegeAddress, String collegeEmail,String name, int code, int collegesNumber, ArrayList<String> course, String director, String address,
			long contact, String email){
		super(name,code,collegesNumber,course,director,address,contact,email);
		this.collegeName = collegeName;
		this.collegeCode = collegeCode;
		this.grade = grade;
		this.principal = principal;
		this.collegeStudents = collegeStudents;
		this.departments = departments;
		this.collegeAddress = collegeAddress;
		this.collegeEmail = collegeEmail;
	}
	
	public void displayCollege() {
		System.out.println("College Name : "+collegeName);
		System.out.println("College Code : "+collegeCode);
		System.out.println("College Grade : "+grade);
		System.out.println("College Principal : "+principal);
		System.out.println("College Students : "+collegeStudents);
		System.out.println("College Departments : "+departments);
		System.out.println("College Address : "+collegeAddress);
		System.out.println("College Email : "+collegeEmail);
		System.out.println();
	}
}

class Department extends College{
	private String departmentName;
	private String hod;
	private int staff;
	private int departmentStudents;
	
	public Department(){
		super();
	}

	public Department(String departmentName, String hod, int staff, int departmentStudents,String collegeName, 
			int collegeCode, String grade, String principal, int collegeStudents,
			ArrayList<String> departments, String collegeAddress, String collegeEmail,String name, int code, int collegesNumber, 
			ArrayList<String> course, String director, String address,long contact, String email) {
		super(collegeName,collegeCode,grade,principal,collegeStudents,
				departments,collegeAddress,collegeEmail,name,code,collegesNumber,course,director,address,
				contact,email);
		this.departmentName = departmentName;
		this.hod = hod;
		this.staff = staff;
		this.departmentStudents = departmentStudents;
	}
	
	public void displayDepartment() {
		System.out.println("Department Name : "+departmentName);
		System.out.println("Department HOD : "+hod);
		System.out.println("Department Staff : "+staff);
		System.out.println("Department Students : "+departmentStudents);
		System.out.println();
	}
}

class Professor extends Department{
	private String professorName;
	private String designation;
	private String education;
	private long professorContact;
	
	public Professor() {
		super();
	}
	
	public Professor(String professorName, String designation, String education, long professorContact,
			String departmentName, String hod, int staff, int departmentStudents,String collegeName, int collegeCode, 
			String grade, String principal, int collegeStudents,
			ArrayList<String> departments, String collegeAddress, String collegeEmail,String name, int code, int collegesNumber, 
			ArrayList<String> course, String director, String address,
			long contact, String email) {
		super(departmentName,hod,staff,departmentStudents,collegeName,collegeCode,grade,principal,collegeStudents,
				departments,collegeAddress,collegeEmail,name,code,collegesNumber,course,director,address,
				contact,email);
		this.professorName = professorName;
		this.designation = designation;
		this.education = education;
		this.professorContact = professorContact;
	}
	
	public void displayProfessor() {
		System.out.println("Professor Name : "+professorName);
		System.out.println("Professor Designation : "+designation);
		System.out.println("Professor Education : "+education);
		System.out.println("Professor Contact : "+professorContact);
		System.out.println();
	}
}

public class multilevelInheritanceEx1 {
	public static void main(String[] args) {
		
		ArrayList<String> depart = new ArrayList<String>();
		depart.add("CS");
		depart.add("MECH");
		depart.add("Civil");
		depart.add("EEE");
		depart.add("ENTC");
		
		ArrayList<String> course = new ArrayList<String>();
		course.add("Engineering");
		course.add("Pharmacy");
		course.add("MBA");
		course.add("BCA");
		
		
		Professor p = new Professor("Mahendra Dalavi","Senior Professor","PHD",9226775085l,"Computer Science","Wankhade Sir",10,120,
				"Sapkal College",98600,"A","Bagal Sir",1000,depart,"Nashik","sapkal@gmail.com","SPPU",1234,199,course,"Someone",
				"Ganeshkhind Pune",9986654845l,"sppu@gmail.com");
		p.displayProfessor();
		p.displayDepartment();
		p.displayCollege();
		p.displayUniversity();
	}
}