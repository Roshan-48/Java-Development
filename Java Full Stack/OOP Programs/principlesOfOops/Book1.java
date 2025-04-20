package principlesOfOops;

public class Book1 {
	private String type;
	private String brand;
	private String subject;
	private int pages;
	private String size;
	private double price;
	
	public Book1(String type, String brand, String subject, int pages, String size, double price) {
		super();
		this.type = type;
		this.brand = brand;
		this.subject = subject;
		this.pages = pages;
		this.size = size;
		this.price = price;
	}
	
	public void displayBook1() {
		System.out.println(" Book Brand : "+brand);
		System.out.println("Book Type : "+type);
		System.out.println("Book Subject : "+subject);
		System.out.println("Book Pages : "+pages);
		System.out.println("Book Size : "+size);
		System.out.println("Book Price : "+price);
		System.out.println();
	}
}
