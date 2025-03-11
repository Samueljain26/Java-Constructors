// Base class: Employee
class Employee {
    public int employeeID; // Public variable
    protected String department; // Protected variable
    private double salary; // Private variable

    // Constructor
    Employee() {
        employeeID = 101;
        department = "IT";
        salary = 50000;
    }

    // Setter method to modify salary
    void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter method to retrieve salary
    double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

//subclass: Manager (inherits from Employee)
class Manager extends Employee {
}

// Main class
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an instance of Manager
        Manager m1 = new Manager();
        System.out.println("Employee ID: " + m1.employeeID);
        System.out.println("Department: " + m1.department);
        m1.displayDetails();

        // Modifying salary using setter
        m1.setSalary(55000);
        System.out.println("Updated Salary: " + m1.getSalary());
    }
}
/*Employee ID: 101
Department: IT
Employee ID: 101
Department: IT
Salary: 50000.0
Updated Salary: 55000.0
 */