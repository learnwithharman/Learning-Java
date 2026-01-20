// This is a normal class (blueprint)
class Calculator {

    /*
     * Method:
     * - Performs addition
     * - Takes two integers as input
     * - Returns integer result
     */
    public int add(int num1, int num2) {
        int r = num1 + num2;   // local variable
        return r;              // return result to caller
    }
}

// This class contains main() method → program starts here
public class ObjClass {

    public static void main(String[] args) {

        /*
         * Object creation:
         * Calculator = class
         * calc = reference variable
         * new Calculator() = object in memory
         */
        Calculator calc = new Calculator();

        /*
         * Method call using object:
         * object.method(arguments)
         */
        int result = calc.add(4, 5);

        System.out.println("Result: " + result);
    }
}
