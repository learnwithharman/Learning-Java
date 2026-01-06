public class string {

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

        



    }
    
}
