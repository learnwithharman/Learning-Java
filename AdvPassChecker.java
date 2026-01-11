import java.util.Scanner;

public class AdvPassChecker {

    public static void main(String[] args) throws InterruptedException {

        String correctPassword = "adminHarman";
        Scanner sc = new Scanner(System.in);

        int wrongAttempts = 0;
        int waitTime = 10;   // seconds

        while (true) {

            System.out.print("Enter your Password: ");
            String inputPassword = sc.nextLine();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break;   // exit loop
            } 
            else {
                wrongAttempts++;
                System.out.println("Incorrect Password.");

                // If 3 wrong attempts
                if (wrongAttempts == 3) {

                    System.out.println("Too many wrong attempts!");
                    System.out.println("Please wait " + waitTime + " seconds...");

                    Thread.sleep(waitTime * 1000);   // convert sec → milliseconds

                    waitTime += 10;     // increase wait time
                    wrongAttempts = 0; // reset counter
                }
            }
        }

        sc.close();
    }
}
