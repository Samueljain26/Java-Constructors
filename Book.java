// Base class: Book
class BookDemo {
    public int  isbn; //public member
    protected String title; //protected member
    private String author;//private member

    // Constructor
    BookDemo(){
        isbn=100;
        title= "Java";
        author="Samuel";
    }


     void setAuthor(String author){
        this.author=author;
    }
     String getAuthor(){
        return author;

    }
    // Method to display book details
    public void displayDetails() {
        System.out.println("Author: " + author);
    }
}

// Empty subclass: Ebook(inherits from BookDemo)
class Ebook extends BookDemo{

}
class Book{
    // Main class
    public static void main(String[] args) {
        // Creating an instance of Ebook
        Ebook b1=new Ebook();
        System.out.println("Protected ISBN: " +b1.isbn);
        System.out.println("Protected Title: " +b1.title);
        b1.displayDetails();

        // Modifying author using setter
        b1.setAuthor("New Author");
        System.out.println("Updated author: " + b1.getAuthor());
    }
}
/*Protected ISBN: 100
Protected Title: Java
Author: Samuel
Updated author: New Author
 */