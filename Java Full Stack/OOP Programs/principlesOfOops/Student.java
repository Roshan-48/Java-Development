package principlesOfOops;

public class Student {
	private String institute = "Qspiders";
	private String name;
	private String course;
	private double fees;
	private String branch;
	private double cgpa;
	private String degree;
	private double sscPer;
	private double hscPer;
	private long phno;
	
	public Student(String name,String course, double fees, String branch, double cgpa, String degree, double sscPer, double hscPer, long phno) {
		this.name = name;
		this.course = course;
		this.fees = fees;
		this.branch = branch;
		this.cgpa = cgpa;
		this.degree = degree;
		this.sscPer = sscPer;
		this.hscPer = hscPer;
		this.phno = phno;		
	}
	
	public String getInstitute() {
		return institute;
	}

	public String getUsername(){
		return name;
	}
	
	public String getCoursename() {
		return course;
	}
	
	public double getFees() {
		return fees;
	}
	public void setBranch(boolean permission, String branch) {
		if(permission) {
			this.branch = branch;
			System.out.println("Branch Updated!");
		}
		else
			System.out.println("First get permission!");
	}
	
	public String getBranch() {
		return branch;
	}
	
	
	public double getCGPA() {
		return cgpa;
	}
	
	public String getDegree() {
		return degree;
	}
	public double getSSC() {
		return sscPer;
	}
	public double getHSC() {
		return hscPer;
	}
	
	public void setPhno(boolean valid, long phno) {
		if(valid) {
			this.phno = phno;
			System.out.println("Phone Number Updated!");
		}
		else
			System.out.println("Unable to update Phone Number");
	}
	
	public long getPhno() {
		return phno;
	}
	
}	
