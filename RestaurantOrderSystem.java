import java.util.Scanner;

public class RestaurantOrderSystem {

    /*
     * ================================
     * RESTAURANT ORDERING SYSTEM
     * ================================
     *
     * Concepts:
     * - while(true) → repeat menu
     * - switch → item selection
     * - total += price → bill accumulate
     * - break → exit ordering
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double total = 0;

        while (true) {

            System.out.println("\n====== MENU ======");
            System.out.println("1. Burger     - ₹120");
            System.out.println("2. Pizza      - ₹200");
            System.out.println("3. Fries      - ₹80");
            System.out.println("4. Cold Drink - ₹50");
            System.out.println("5. Checkout");
            System.out.print("Select item: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    total += 120;   // add to bill
                    System.out.println("Burger added.");
                    break;

                case 2:
                    total += 200;
                    System.out.println("Pizza added.");
                    break;

                case 3:
                    total += 80;
                    System.out.println("Fries added.");
                    break;

                case 4:
                    total += 50;
                    System.out.println("Cold Drink added.");
                    break;

                case 5:
                    System.out.println("\nFinal Bill: ₹" + total);
                    System.out.println("Thank you for ordering!");
                    sc.close();
                    return;   // exit program

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
