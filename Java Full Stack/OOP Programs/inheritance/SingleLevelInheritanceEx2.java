package inheritance;

class BankAccount{
	String name;
	String ifsc;
	String bankName;
	long accno;
	int pin;
	String branch;
	long phno;
	
	public BankAccount() {
		
	}
	
	BankAccount(String name, String ifsc, String bankName, long accno, int pin, String branch, long phno) {
		super();
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
	}
	
	public void displayBankAccount() {
		System.out.println(name);
		System.out.println(ifsc);
		System.err.println(bankName);
		System.out.println(accno);
		System.out.println(pin);
		System.out.println(branch);
		System.out.println(phno);
	}
	
}


class SavingsAccount extends BankAccount{
	double balance;
	double interest;
	String type;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(String name, String ifsc, String bankName, long accno, int pin, String branch, long phno, double balance, double interest, String type) {
		super(name, ifsc, bankName, accno, pin, branch, phno);
		this.balance = balance;
		this.interest = interest;
		this.type = type;
	}
	
	public void displaySavingsAccount() {
		displayBankAccount();
		System.out.println(balance);
		System.out.println(interest);
		System.out.println(type);
	}
}


public class SingleLevelInheritanceEx2 {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount("Raju","ICICI123","ICICI",60179876769l,1234,"Deccan",9860017548l,10000.0,3.0,"Savings Account");
		
		s1.displayBankAccount();
		System.out.println("-----------------------------------------");
		s1.displaySavingsAccount();
	}

}
