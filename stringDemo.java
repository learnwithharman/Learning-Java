public class stringDemo {

    /*
     * STRING IN JAVA – SHORT NOTES
     *
     * - String is a non-primitive data type in Java
     * - It is an object of String class
     * - Strings are immutable (cannot be changed once created)
     * - String literals are stored in String Constant Pool
     *
     * Comparison:
     * - ==  : compares reference
     * - equals() : compares content
     *
     * Common methods:
     * - length()
     * - charAt()
     * - substring()
     * - toUpperCase(), toLowerCase()
     * - replace()
     *
     * String vs StringBuilder:
     * - String → immutable
     * - StringBuilder → mutable and faster
     *
     * Interview line:
     * String in Java is an immutable object used to store characters.
     */
    public static void main(String[] args) {

        // string declaration
        String greeting = "Hello!";
        String car ="Mustag";
        String colour = "Red";

        // sting concatenation also priniting
        System.out.println("I have a "+ colour +" "+ car);
        System.out.println(greeting +"I'm Owner of this car");

        // string methods examples

        // length() expected output: 6
        System.out.println("Length of car name :" + car.length());

        // charAt() expected output: M
        System.out.println("First character of car name :" + car.charAt(0));

        // substring() expected output: ust
        System.out.println("Substring of car name from index 1 to 4 :" + car.substring(1,4));

        // toUpperCase() and toLowerCase() expected output: HELLO! and hello!
        System.out.println("greeting in uppercase " + greeting.toUpperCase() + "and in lowercase " + greeting.toLowerCase());

        // replace() expected output: Hella!
        System.out.println("Replacing 'o' with 'a' in greeting: " + greeting.replace('o', 'a'));

        // String immutability
        String brand = "Ford";
        brand = brand + " Motors";
        System.out.println("Brand: " + brand);

    }
    
}
