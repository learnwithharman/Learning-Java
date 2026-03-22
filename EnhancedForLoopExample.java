public class EnhancedForLoopExample {

    public static void main(String[] args) {

        // Enhanced for loop (also called for-each loop) is used to iterate
        // over elements of an array or collection without using an index.
        // It makes the code simpler, more readable, and reduces chances of errors.

        // Syntax:
        // for (dataType variable : array/collection) {
        //     // code to be executed
        // }

        int[] numbers = {10, 20, 30, 40, 50};

        // Using enhanced for loop to print array elements
        for (int num : numbers) {
            // 'num' stores each element of the array one by one
            System.out.println(num);
        }
    }
}