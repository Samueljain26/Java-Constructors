class Person {
    String name;
    int age;

    // Parameterized Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor (Cloning another Person)
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    // Method to display Person details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating the first Person object
        Person p1 = new Person("Samuel", 21);
        System.out.println("Original Person:");
        p1.display();

        System.out.println();

        // Creating a second Person object by copying p1
        Person p2 = new Person(p1);
        System.out.println("Cloned Person:");
        p2.display();
    }
}
/*
Original Person:
Name: Samuel
Age: 21

Cloned Person:
Name: Samuel
Age: 21
 */