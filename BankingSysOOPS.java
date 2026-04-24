// Base class demonstrating Encapsulation
class BankAccount {

    // Private variables (data hiding)
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account details
    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }
}


// Child class demonstrating Inheritance
class SavingsAccount extends BankAccount {

    // Additional property specific to SavingsAccount
    private double interestRate;

    // Constructor calls parent constructor using super
    SavingsAccount(String name, double balance, double rate) {
        super(name, balance);   // initialize parent class
        this.interestRate = rate;
    }

    // Method to add interest to the balance
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;

        // Using parent class method to update balance
        deposit(interest);

        System.out.println("Interest added: " + interest);
    }
}


// Main class to run the program
public class BankingSysOOPS {

    public static void main(String[] args) {

        // Creating object of SavingsAccount (child class)
        SavingsAccount acc = new SavingsAccount("Harman", 10000, 5);

        // Accessing data using getter (Encapsulation)
        System.out.println("Account Holder: " + acc.getAccountHolderName());

        // Performing banking operations
        acc.deposit(2000);
        acc.withdraw(3000);

        // Adding interest (Inheritance feature)
        acc.addInterest();

        // Display final balance
        System.out.println("Final Balance: " + acc.getBalance());
    }
}