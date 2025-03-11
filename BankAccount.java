// Base class: BankAccount
class BankAccount {
    public int accountNumber; // Public member
    protected String accountHolder; // Protected member
    private double balance; // Private member

    // Constructor
    BankAccount() {
        accountNumber = 101;
        accountHolder = "Samuel";
        balance = 5000.0;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

//subclass: SavingsAccount
class SavingsAccount extends BankAccount {
}

// Main class to test the program
class Bank {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount acc = new SavingsAccount();

        // Displaying account details
        acc.displayDetails();

        // Depositing and withdrawing money
        acc.deposit(2000.0);
        acc.withdraw(1500.0);

        // Display updated balance
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}