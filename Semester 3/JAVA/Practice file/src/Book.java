

public class Book {
    private int bookId;
    private int pages;
    private double price;
    //data members using parameters
    public void set(int id, int pa, double p) {
        bookId = id;
        pages = pa;
        price = p;
    }
    //  display values
    public void show() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);
    }
    //   return the value of price
    public double getPrice() { 
        return price;
    }
     public static void showMaxPriceBook(Book[] books) {
	        double maxPrice = Double.MIN_VALUE;
	        int maxIndex = -1;

	        for (int i = 0; i < books.length; i++) {
	            if (books[i].getPrice() > maxPrice) {
	                maxPrice = books[i].getPrice();
	                maxIndex = i;
	            }
	        }

	        if (maxIndex != -1) {
	            System.out.println("Record with maximum book price:");
	            books[maxIndex].show();
	        } else {
	            System.out.println("No records found.");
	        }
	    }
}