package tech.codehunt.dto;

public class EmployeeDTO {
		
	private String usrename;
	private String password;
	private String fullname;
	private String address;
	private int salary;
	
	public EmployeeDTO() {
		
	}

	public EmployeeDTO(String usrename, String password, String fullname, String address, int salary) {
		super();
		this.usrename = usrename;
		this.password = password;
		this.fullname = fullname;
		this.address = address;
		this.salary = salary;
	}

	public String getUsrename() {
		return usrename;
	}

	public void setUsrename(String usrename) {
		this.usrename = usrename;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
