import java.util.Scanner;

public class atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;   // Initial balance
        int ch;

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("Please select an option:");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            ch = sc.nextInt();

            if (ch == 4) {
                break;
            }

            switch (ch) {

                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid deposit amount.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Successfully deposited: " + depositAmount + " $");
                        System.out.println("Updated balance: " + balance + " $");
                    }
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    }
                    else {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrawn: " + withdrawAmount + " $");
                        System.out.println("Remaining balance: " + balance + " $");
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: " + balance + " $");
                    break;

                default:
                    System.out.println("Invalid option selected.");
            }
        }
        System.out.println("Thank you for using the ATM. Have a nice day!");
        sc.close();
    }
}
