package book.com;

public class BookDemo {
	 protected String isbn;
	    protected String title;
	    protected String author;
	    protected double price;

	    // Parameterized constructor to initialize data members
	    public BookDemo(String isbn, String title, String author, double price) {
	        this.isbn = isbn;
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    // Method to display details of the book
	    public void displayDetails() {
	        System.out.println("ISBN: " + isbn);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: $" + price);
	    }

}
