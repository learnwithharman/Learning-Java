import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int seats;
        double totalBill = 0;

        while (true) {

            System.out.println("\n====== MOVIE MENU ======");
            System.out.println("1. Avengers  (₹200 per seat)");
            System.out.println("2. Inception (₹180 per seat)");
            System.out.println("3. Interstellar (₹220 per seat)");
            System.out.println("4. Exit");
            System.out.print("Select movie: ");

            choice = sc.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Enter number of seats: ");
            seats = sc.nextInt();

            if (seats <= 0) {
                System.out.println("Invalid seat count!");
                continue;
            }

            switch (choice) {

                case 1:
                    totalBill = seats * 200;
                    System.out.println("Movie: Avengers");
                    break;

                case 2:
                    totalBill = seats * 180;
                    System.out.println("Movie: Inception");
                    break;

                case 3:
                    totalBill = seats * 220;
                    System.out.println("Movie: Interstellar");
                    break;

                default:
                    System.out.println("Invalid movie choice!");
                    continue;
            }

            System.out.println("Seats Booked: " + seats);
            System.out.println("Total Bill: ₹" + totalBill);
        }

        System.out.println("\nThank you for booking!");
        sc.close();
    }
}
