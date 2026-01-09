import java.util.Scanner;

public class area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double length;
        double width;

        // Validate length
        do {
            System.out.print("Enter the length of the rectangle (positive value): ");
            length = input.nextDouble();

            if (length <= 0) {
                System.out.println("Invalid input! Length must be greater than 0.");
            }

        } while (length <= 0);

        // Validate width
        do {
            System.out.print("Enter the width of the rectangle (positive value): ");
            width = input.nextDouble();

            if (width <= 0) {
                System.out.println("Invalid input! Width must be greater than 0.");
            }

        } while (width <= 0);

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area + " Sq units.");

        if (length == width) {
            System.out.println("This rectangle is also a square.");
        } else {
            System.out.println("This rectangle is not a square.");
        }

        input.close();
    }
    
}
