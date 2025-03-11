class Vehicles {
    // Instance variables
    String ownerName;
    String vehicleType; // in months

    // Class variable (common for all vehicles)
    static double registerationFees = 0.0;

    // Constructor
    Vehicles(String owner, String type) {
        this.ownerName = owner;
        this.vehicleType = type;
    }

    // Instance method to display vehicles details
    void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registeration fees:" + registerationFees);
    }

    // Static method to update the registeration fees
    static void updateRegisterationFees(double newFees) {
        registerationFees = newFees;
    }

    public static void main(String[] args) {
        // Creating Vehicles objects
        Vehicles v1 = new Vehicles("Samuel", "LMV");

        // Display initial vehicles details
        System.out.println("Before updating registeration fees:");
        v1.displayDetails();

        // Update regsiteration fees
        Vehicles.updateRegisterationFees(2000.00);

        // Display updated course details
        System.out.println("After updating registeration fees:");
        v1.displayDetails();
    }
}
/*Before updating registeration fees:
Owner Name: Samuel
Vehicle Type: LMV
Registeration fees:0.0
After updating registeration fees:
Owner Name: Samuel
Vehicle Type: LMV
Registeration fees:2000.0
 */