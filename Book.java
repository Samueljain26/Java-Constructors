import java.util.*;
class Books{
    String title;
    String author;
    double price;

    Books(){
        title = "Title";
        author ="Author";
        price = 0.0;
    }
    Books(String title,String author,double price){
        this.title =title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: "+ author);
        System.out.println("Price: " + price);
    }
}

class Book {
    public static void main(String[] args) {
        Books book1 =new Books();
        book1.display();
        Books book2 =new Books("new title","new author",1000);
        book2.display();
    }
}
/*Title: Title
Author: Author
Price: 0.0
Title: new title
Author: new author
Price: 1000.0
 */