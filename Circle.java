import java.util.*;

class Circle {
    double radius;

    // Default Constructor
    Circle() {
        radius =1.0; // Calls the parameterized constructor with default value 1.0
    }

    // Parameterized Constructor
    Circle(double r) {
        radius = r;
    }

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double userRadius =sc.nextDouble();
        // Using Default Constructor
        Circle c1 = new Circle();
        c1.display();

        System.out.println();

        // Using Parameterized Constructor
        Circle c2 = new Circle(userRadius);
        c2.display();
    }
}
/*Enter the radius:
5
Radius: 1.0
Area: 3.141592653589793

Radius: 5.0
Area: 78.53981633974483


 */