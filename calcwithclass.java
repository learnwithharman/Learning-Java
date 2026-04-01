import java.util.Scanner;

// Calculator class
class Calculator {

    // Methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }
}

// Main class
public class calcwithclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + calc.add(a, b));
                break;
            case '-':
                System.out.println("Result: " + calc.subtract(a, b));
                break;
            case '*':
                System.out.println("Result: " + calc.multiply(a, b));
                break;
            case '/':
                System.out.println("Result: " + calc.divide(a, b));
                break;
            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}