public class LoopsInJava {
    public static void main(String[] args) {

        /*
         * --------------------
         * 1. WHILE LOOP
         * --------------------
         * Repeats a block of code while a condition is true.
         *
         * Syntax:
         * while(condition) {
         *     // code
         * }
         */

        int x =1;
        while (x<=5){
            System.out.println("X is : " + x);
            x++;
        };
        /*
         * --------------------
         * 2. DO - WHILE LOOP
         * --------------------
         * Executes code block once, then repeats while condition is true.
         */

        int number = 1;
        do {
            System.out.println("Number is: " + number);
            number++;
        } while (number <= 5);

        /*
         * --------------------
         * 3. FOR LOOP
         * --------------------
         * Repeats a block of code a specific number of times.
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("i is: " + i);
        }

        /*
         * --------------------
         * 4. NESTED LOOPS
         * --------------------
         * A loop inside another loop.
         */

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
