//Encapsulation Example

package principlesOfOops;

public class BankAccountDriver {
	public static void main(String[]args) {
		BankAccount b1 = new BankAccount("Raju","ICIC",9860017548l,1234,"ICIC530");
		
		System.out.println(b1.getBalance(9860017548l,1234));
		b1.credit(9860017548l,1234,2000);
		b1.debit(9860017548l,1234,1000);
		
		System.out.println(b1.getBalance(9860017548l,1234));
		b1.setPin(9860017548l,1234,3242);
		
		b1.debit(9860017548l,3242,500);
		
		
	}
}
