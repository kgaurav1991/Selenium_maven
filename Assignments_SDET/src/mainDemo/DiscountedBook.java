package mainDemo;

import book.com.BookDemo;

public class DiscountedBook extends BookDemo{

	public DiscountedBook(String isbn, String title, String author, double price) {
		super(isbn, title, author, price);
		// TODO Auto-generated constructor stub
	}
	
    // Method to calculate discounted price
    public double discountedPrice(double discountPercent) {
        double discountAmount = (discountPercent / 100) * price;
        double discountedPrice = price - discountAmount;
        return discountedPrice;
    }

	public static void main(String[] args) {
		DiscountedBook book = new DiscountedBook("978-3-16-148410-0", "The Great Gaurav", "Author Name Kumar", 18.99);

	        // Displaying book details
	        System.out.println("Book Details:");
	        book.displayDetails();

	        // Calculating and displaying discounted price with 10% discount
	        double discount = 10;
	        double discountedPrice = book.discountedPrice(discount);
	        System.out.printf("Discounted Price (%.0f%% off): $%.2f\n", discount, discountedPrice);

	}

}
