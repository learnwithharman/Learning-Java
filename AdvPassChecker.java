import java.util.Scanner;

public class AdvPassChecker {

    // NOTE:
    // equals() is used for String comparison, NOT ==
    // == compares memory reference, equals() compares actual text

    // NOTE:
    // throws InterruptedException is required because Thread.sleep() can be interrupted
    public static void main(String[] args) throws InterruptedException {

        String correctPassword = "adminHarman";
        Scanner sc = new Scanner(System.in);

        int wrongAttempts = 0;   // Counts consecutive wrong entries
        int waitTime = 10;       // Delay in seconds (increases after every lock)

        // NOTE:
        // while(true) creates infinite loop
        // break is used to exit the loop manually
        while (true) {

            System.out.print("Enter your Password: ");
            String inputPassword = sc.nextLine();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break;
            } 
            else {
                wrongAttempts++;

                // NOTE:
                // Lock triggers after 3 wrong attempts
                if (wrongAttempts == 3) {

                    System.out.println("Too many wrong attempts!");
                    System.out.println("Please wait " + waitTime + " seconds...");

                    // NOTE:
                    // sleep() works in milliseconds → seconds × 1000
                    Thread.sleep(waitTime * 1000);

                    waitTime += 10;      // Progressive delay
                    wrongAttempts = 0;  // Reset attempt counter
                }
            }
        }

        sc.close();
    }
}

