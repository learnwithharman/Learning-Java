import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

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
