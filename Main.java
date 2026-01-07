// Importing Scanner class from java.util package
// Scanner is used to take input from the user (keyboard)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creating Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter name
        System.out.println("Enter your name :");

        // nextLine() is used to read a full line of text (String)
        // It reads input until the user presses Enter
        String name = scanner.nextLine();

        // Asking user to enter age
        System.out.println("Enter your age : ");

        // nextInt() is used to read an integer value
        // It only reads numbers (int)
        int age = scanner.nextInt();

        // Printing greeting message using String concatenation
        System.out.println("Hello, " + name + "! Welcome to the Simulation World");
        System.out.println("You are " + age + " years old");

        // Closing the scanner to free system resources
        scanner.close();
    }
}
