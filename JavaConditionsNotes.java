public class JavaConditionsNotes {

    /*
     * =====================================
     * CONDITIONAL STATEMENTS IN JAVA (NOTES)
     * =====================================
     *
     * Conditional statements are used to execute code
     * based on a condition (true or false).
     *
     * Java supports:
     * 1. if
     * 2. if - else
     * 3. if - else - if
     * 4. nested if
     * 5. switch
     * 6. ternary operator
     *
     * -------------------------------------
     * IMPORTANT RULES
     * -------------------------------------
     * - Condition must return boolean value.
     * - Curly braces { } define block of execution.
     * - == is used for comparison, = is assignment.
     * - Logical operators (&&, ||) are often used.
     * - Java is case-sensitive.
     */

    public static void main(String[] args) {

        /*
         * --------------------
         * 1. IF STATEMENT
         * --------------------
         * Executes code only when condition is true.
         *
         * Syntax:
         * if(condition) {
         *     // code
         * }
         */

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        /*
         * --------------------
         * 2. IF - ELSE
         * --------------------
         * Executes one block if condition is true,
         * otherwise executes else block.
         */

        int number = 7;
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        /*
         * --------------------
         * 3. IF - ELSE - IF
         * --------------------
         * Used when multiple conditions are checked.
         */

        int marks = 65;
        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 60) {
            System.out.println("Grade B");
        }
        else {
            System.out.println("Grade C");
        }

        /*
         * --------------------
         * 4. NESTED IF
         * --------------------
         * One if inside another if.
         */

        int age = 20;
        if (age >= 18) {
            if (age < 60) {
                System.out.println("Adult");
            }
        }

        /*
         * --------------------
         * 5. SWITCH CASE
         * --------------------
         * Used when comparing fixed values.
         * Works with int, char, String, enum.
         *
         * break stops execution of switch.
         */

        int choice = 1;

        switch (choice) {
            case 1:
                System.out.println("Option One");
                break;

            case 2:
                System.out.println("Option Two");
                break;

            default:
                System.out.println("Invalid option");
        }

        /*
         * --------------------
         * 6. TERNARY OPERATOR
         * --------------------
         * Short form of if-else.
         *
         * Syntax:
         * condition ? value1 : value2
         */

        int a = 5, b = 10;
        int max = (a > b) ? a : b;
        System.out.println("Max value: " + max);

        /*
         * --------------------
         * QUICK REVISION POINTS
         * --------------------
         * - if is used for simple conditions.
         * - if-else handles two outcomes.
         * - else-if handles multiple conditions.
         * - switch is faster for fixed values.
         * - ternary reduces code length.
         */
    }
}
