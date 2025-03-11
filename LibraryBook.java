class Book2 {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Parameterized Constructor
    Book2(String t, String a, double p, boolean available) {
        this.title = t;
        this.author = a;
        this.price = p;
        this.isAvailable = available;
    }

    // Method to borrow a book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as borrowed
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
class LibraryBook{
    public static void main(String[] args) {
        // Creating books
        Book2 book1 = new Book2("The Alchemist", "abc", 9.99, true);
        Book2 book2 = new Book2("1984", "xyz", 12.50, false);

        // Displaying book details
        System.out.println("Book 1 Details:");
        book1.displayBook();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.displayBook();
        System.out.println();

        // Borrowing books
        System.out.println("Attempting to borrow Book 1:");
        book1.borrowBook();
        System.out.println();

        System.out.println("Attempting to borrow Book 2:");
        book2.borrowBook();
    }
}
