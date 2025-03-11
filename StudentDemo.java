// Base class: Student
class Student {
    public int rollNumber; // Public member (accessible from anywhere)
    protected String name; // Protected member (accessible within package and subclass)
    private double CGPA; // Private member (accessible only within this class)

    // Constructor
    Student() {
        rollNumber = 10;
        name = "Samuel";
        CGPA = 9.0 ;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA= CGPA;
    }
    public double getCGPA() {
        return CGPA;

    }


    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + CGPA);
    }
}

// Empty subclass: PostgraduateStudent (inherits from Student)
class PostgraduateStudent extends Student {

}
class StudentDemo{
// Main class
    public static void main(String[] args) {
        // Creating an instance of Student
        PostgraduateStudent s1 = new PostgraduateStudent();
        System.out.println("Protected name: " + s1.name);
        s1.displayStudentDetails();

        // Modifying CGPA using setter
        s1.setCGPA(9.5);
        System.out.println("Updated CGPA: " + s1.getCGPA());
    }
    }
    /*Protected name: Samuel
Roll Number: 10
CGPA: 9.0
Updated CGPA: 9.5
     */