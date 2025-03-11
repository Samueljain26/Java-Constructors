class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
         // Calls the parameterized constructor with default values
        guestName ="Samuel";
        roomType ="Normal";
        nights =2;
    }

    // Parameterized Constructor
    HotelBooking(String gName, String rType, int n) {
        this.guestName = gName;
        this.roomType = rType;
        this.nights = n;
    }

    // Copy Constructor (Cloning an existing booking)
    HotelBooking(HotelBooking hb) {
        guestName = hb.guestName;
        roomType = hb.roomType;
        nights = hb.nights;
    }

    // Method to display booking details
    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Default booking
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.display();

        System.out.println();

        // Custom booking
        HotelBooking customBooking = new HotelBooking("Rohit", "Deluxe", 3);
        System.out.println("Custom Booking:");
        customBooking.display();

        System.out.println();

        // Copying a booking
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking:");
        copiedBooking.display();
    }
}
/*Default Booking:
Guest Name: Samuel
Room Type: Normal
Nights: 2

Custom Booking:
Guest Name: Rohit
Room Type: Deluxe
Nights: 3

Copied Booking:
Guest Name: Rohit
Room Type: Deluxe
Nights: 3
 */