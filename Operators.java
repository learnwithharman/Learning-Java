public class Operators {

    /*
     * ============================
     * JAVA OPERATORS – QUICK NOTES
     * ============================
     *
     * Operators are symbols used to perform operations on variables and values.
     *
     * Types of operators:
     * 1. Arithmetic Operators
     * 2. Assignment Operators
     * 3. Relational (Comparison) Operators
     * 4. Logical Operators
     * 5. Increment / Decrement Operators
     * 6. Unary Operators
     * 7. Ternary Operator
     *
     * ---------------------------------
     * FREQUENTLY ASKED INTERVIEW POINTS
     * ---------------------------------
     * - Difference between == and =
     * - Difference between && and &
     * - Difference between ++x and x++
     * - Modulus (%) use case
     * - Ternary operator usage
     */

    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        /*
         * ------------------------
         * 1. ARITHMETIC OPERATORS
         * ------------------------
         * + Addition
         * - Subtraction
         * * Multiplication
         * / Division (integer division removes decimal part)
         * % Modulus (gives remainder)
         */

        System.out.println("Addition: " + (x + y)); // 13
        System.out.println("Subtraction: " + (x - y)); // 7
        System.out.println("Multiplication: " + (x * y)); // 30
        System.out.println("Division: " + (x / y)); // 3
        System.out.println("Modulus: " + (x % y)); // 1

        /*
         * NOTE:
         * Integer division truncates decimal values.
         * Example: 10 / 3 = 3 (not 3.33)
         */

        /*
         * ------------------------
         * 2. ASSIGNMENT OPERATORS
         * ------------------------
         * = Assign value
         * += Add and assign
         * -= Subtract and assign
         * *= Multiply and assign
         * /= Divide and assign
         * %= Modulus and assign
         */

        int a = 5;
        a += 2; // a = a + 2 → 7
        System.out.println("After += : " + a);

        a -= 1; // a = a - 1 → 6
        System.out.println("After -= : " + a);

        /*
         * -------------------------------
         * 3. RELATIONAL (COMPARISON)
         * -------------------------------
         * == Equal to
         * != Not equal to
         * > Greater than
         * < Less than
         * >= Greater than or equal
         * <= Less than or equal
         */

        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x > y  : " + (x > y));
        System.out.println("x < y  : " + (x < y));

        /*
         * NOTE:
         * == compares values for primitives.
         * = is assignment operator.
         */

        /*
         * ------------------------
         * 4. LOGICAL OPERATORS
         * ------------------------
         * && Logical AND (both must be true)
         * || Logical OR (any one true)
         * ! Logical NOT (reverse)
         */

        boolean p = true; 
        boolean q = false;

        System.out.println("p && q : " + (p && q)); // false
        System.out.println("p || q : " + (p || q)); // true
        System.out.println("!p     : " + (!p)); // false

        /*
         * Difference:
         * && → short-circuit AND
         * & → bitwise AND (checks both sides always)
         */

        /*
         * ------------------------
         * 5. INCREMENT / DECREMENT
         * ------------------------
         * ++ increases value by 1
         * -- decreases value by 1
         */

        int n = 5;
        System.out.println("n++ = " + (n++)); // prints 5, then n becomes 6
        System.out.println("++n = " + (++n)); // increments first, then prints

        /*
         * Difference:
         * n++ → Post increment
         * ++n → Pre increment
         * 
         * Tricky example:
         * int x = 10;
         * int y = x++ + ++x;
         * System.out.println(y);
         * 
         * x++ → use 10, then x becomes 11
         * ++x → x becomes 12, use 12
         * y = 10 + 12 = 22
         */

        /*
         * ------------------------
         * 6. UNARY OPERATORS
         * ------------------------
         * + Unary plus
         * - Unary minus (negation)
         */

        int num = 10;
        System.out.println("Unary + : " + (+num)); //outputs 10
        System.out.println("Unary - : " + (-num)); //outputs -10

        /*
         * ------------------------
         * 7. TERNARY OPERATOR
         * ------------------------
         * condition ? value1 : value2
         * Short form of if-else
         */

        int max = (x > y) ? x : y;
        System.out.println("Maximum value: " + max); // checks which is greater

        /*
         * Example:
         * If x > y → max = x
         * else → max = y
         */
    }
}
