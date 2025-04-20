package principlesOfOops;

public class BagDriver {
	public static void main(String[] args) {
		Bag bag = new Bag("American Tourister", "Laptop Bag", 35, 4, 1500, "Black","Synthetic Material");
		bag.addBook("Notebook","Java","Classmate",400,"A4",55.0);
		bag.addBook("Notebook","SQL","Classmate",300,"A4",50.0);
		bag.addBook("Notebook","Web Tech","Navneet",200,"A4",45.0);
		
		for(Book1 ele : bag.listBook) {
			ele.displayBook1();
		}
		
		bag.addPen("BallPen","Luxor",10,"Black");
		bag.addPen("BallPen","Luxor",10,"Red");
		bag.addPen("BallPen","Luxor",10,"Blue");
		
		for(Pen1 ele : bag.listPen) {
			ele.displayPen1();
		}
		
		bag.addLaptop("HP","Pavillion",70000);
		bag.laptop.displayLaptop();
		
		bag.addWaterBottle("Steel","Milton",1,150);
		bag.bottle.displayWaterBottle();
	}
}
