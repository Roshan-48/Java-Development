package sealedClass;

public class ParentDriver {
	public static void main(String[]args) {
		Child1 ch1 = new Child1();
		System.out.println(ch1.name);
		ch1.displayParent();
	}
}
