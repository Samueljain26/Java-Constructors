import java.sql.SQLOutput;
//class product
class Product {
    //instance variable
    String productName;
    double price;
    //class variable
    static int totalProducts=0;
//constructor
    Product(String name,double price){
        this.productName=name;
        this.price=price;
        totalProducts++;
    }
    //display product details
    void displayDetails(){
        System.out.println("Product Name: " +productName);
        System.out.println("Price: " + price);
    }
    //display number of products
    static void calculateProducts(){
        System.out.println("Total Products: " + totalProducts);
    }
    //main method
    public static void main(String[] args) {
        Product p1 = new Product("Mobile", 1000.0);
        //output by calling the method
        p1.displayDetails();
        Product.calculateProducts();
    }
    }
/*Product Name: Mobile
Price: 1000.0
Total Products: 1
 */

