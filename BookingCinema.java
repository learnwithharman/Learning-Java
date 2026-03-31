import java.util.Scanner;

public class BookingCinema {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int halls = 2;
        int rows = 3;
        int seats = 5;

        int[][][] theatre = new int[halls][rows][seats];

        // Booking system
        System.out.println("Enter hall, row, seat to book:");

        int h = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();

        if (theatre[h][r][s] == 0) {
            theatre[h][r][s] = 1;
            System.out.println("Seat booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }

        // Display seating
        for (int i = 0; i < halls; i++) {
            System.out.println("Hall " + i);
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < seats; k++) {
                    System.out.print(theatre[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}