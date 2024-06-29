package book.com;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;

    // Parameterized constructor
    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Method to calculate discounted price
    public double discountedPrice(double discountPercent) {
        double discountAmount = (discountPercent / 100) * price;
        double discountedPrice = price - discountAmount;
        return discountedPrice;
    }

    public static void main(String[] args) {
        // Creating an object of the Book class
        Book book = new Book("978-3-16-148410-0", "The Great Gaurav", "Author Name Kumar", 15.99);

        // Displaying book details
        System.out.println("Book Details:");
        book.displayDetails();

        // Calculating and displaying discounted price with 10% discount
        double discount = 10;
        double discountedPrice = book.discountedPrice(discount);
        System.out.printf("Discounted Price (%.0f%% off): $%.2f\n", discount, discountedPrice);
    }
}
