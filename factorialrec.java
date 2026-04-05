public class factorialrec {
    public static void main(String[] args) {
        System.out.println(factorial(5)); 
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {   //Agar n = 0 diya toh infinite recursion / error
            return 1;
        }
        return n * factorial(n - 1);
    }
}