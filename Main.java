// Importing Scanner class from java.util package
// Scanner is used to take input from the user (keyboard)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creating Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter name
        System.out.print("Enter your name :");

        // nextLine() is used to read a full line of text (String)
        // It reads input until the user presses Enter
        String name = scanner.nextLine();

        // Asking user to enter age
        System.out.print("Enter your age : ");

        // nextInt() is used to read an integer value
        // It only reads numbers (int)
        int age = scanner.nextInt();

        // Asking user to enter GPA
        System.out.print("Enter you gpa : ");
        // nextDouble() is used to read a double value
        // It reads decimal numbers (double)
        double gpa = scanner.nextDouble();

        // Asking user to enter if they are a student
        System.out.print("Are you a student? (true/false): ");

        // nextBoolean() is used to read a boolean value
        // It reads true or false
        boolean isStudent = scanner.nextBoolean();

        
        // Printing greeting message using String concatenation
        System.out.println("Hello, " + name + "! Welcome to the Simulation World");
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);

        // Using if-else to check if the user is a student
        if (isStudent) {
            System.out.println("You are enrolled as a Student !!.");
        } else {
            System.out.println("You are not enrolled as a student !!.");
        }

        // Closing the scanner to free system resources
        scanner.close();
    }
}
