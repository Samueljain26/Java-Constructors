class Course {
    // Instance variables
    String courseName;
    int duration; // in months
    double fee;

    // Class variable (common for all courses)
    static String instituteName = "Default Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration );
        System.out.println("Fee: ₹" + fee);
    }

    // Static method to update the institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        // Creating Course objects
        Course c1 = new Course("Java Programming", 3, 15000);

        // Display initial course details
        System.out.println("Before updating institute name:");
        c1.displayCourseDetails();

        // Update institute name (affects all courses)
        Course.updateInstituteName("Tech Academy");

        // Display updated course details
        System.out.println("After updating institute name:");
        c1.displayCourseDetails();
    }
}
/*Institute: Default Institute
Course Name: Java Programming
Duration: 3
Fee: ₹15000.0
After updating institute name:
Institute: Tech Academy
Course Name: Java Programming
Duration: 3
Fee: ₹15000.0
 */