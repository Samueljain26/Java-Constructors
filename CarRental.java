class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Parameterized Constructor
    CarRental(String name, String model, int days, double rate) {
        this.customerName = name;
        this.carModel = model;
        this.rentalDays = days;
        this.dailyRate = rate;
    }

    // Method to calculate total cost
    double calculateCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateCost());
    }
}

class CarRentalSystem {
    public static void main(String[] args) {
        // Creating rental instances
        CarRental rental = new CarRental("Samuel", "Honda City", 5, 30.0);
        // Displaying rental details
        System.out.println("Rental Details:");
        rental.displayDetails();
        System.out.println();
    }
}
/*Rental Details:
Customer Name: Samuel
Car Model: Honda City
Rental Days: 5
Daily Rate: 30.0
Total Cost: 150.0
 */