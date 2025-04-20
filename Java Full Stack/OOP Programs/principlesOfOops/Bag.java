package principlesOfOops;

import java.awt.print.Book;
import java.util.ArrayList;
public class Bag {
	private String brand;
	private String type;
	private double litre;
	private int compartment;
	private double price;
	private String color;
	private String material;
	private int bookCount;
	
	ArrayList<Book1> listBook = new ArrayList<Book1>();
	ArrayList<Pen1> listPen = new ArrayList<Pen1>();
	Laptop laptop;
	WaterBottle bottle;
	public Bag(String brand, String type, double litre, int compartment, double price, String color, String material) {
		super();
		this.brand = brand;
		this.type = type;
		this.litre = litre;
		this.compartment = compartment;
		this.price = price;
		this.color = color;
		this.material = material;
	}
	
	public void displayBag() {
		System.out.println("Bag Brand : "+brand);
		System.out.println("Bag Type : "+type);
		System.out.println("Bag Capacity : "+litre);
		System.out.println("Bag Compartment : "+compartment);
		System.out.println("Bag Price : "+price);
		System.out.println("Bag Color : "+color);
		System.out.println("Bag Material : "+material);
		System.out.println();
	}
	
	public void addBook(String type, String subject, String brand, int pages, String size, double price) {
		if(bookCount == 10) {
			System.out.println("New Book cannot be added bag is full");
			return;
		}
		Book1 book = new Book1(type, subject, brand, pages, size, price);
		listBook.add(book);
	}
	
	public void addPen(String type, String brand, double price, String color) {
		Pen1 pen = new Pen1(type, brand, price, color);
		listPen.add(pen);
	}
	
	public void addWaterBottle(String material, String brand, int capacity, double price) {
		bottle = new WaterBottle(material,brand,bookCount,price);
	}
	
	public void addLaptop(String brand, String model, double price) {
		laptop = new Laptop(brand, model, price);
	}
	
}
