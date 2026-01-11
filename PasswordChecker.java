import java.util.Scanner;
public class PasswordChecker {
    public static void main (String[] args){
        String Password = "adminHarman";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Password: ");
        String inputPassword = sc.nextLine();

        while (!inputPassword.equals(Password)) {
            if (!inputPassword.equals(Password)) {
                System.out.println("Incorrect Password, Please try again.");
            }
            System.out.print("Enter your Password: ");
            inputPassword = sc.nextLine();
        }
        System.out.println("login Successful !");
        sc.close();
        }

    }