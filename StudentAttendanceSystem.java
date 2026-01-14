import java.util.Scanner;

public class StudentAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalStudents;
        int presentCount = 0;
        int absentCount = 0;

        System.out.print("Enter total number of students: ");
        totalStudents = sc.nextInt();

        int i = 1;

        // Loop for each student
        while (i <= totalStudents) {

            System.out.print("Enter attendance for student " + i + " (1 = Present, 0 = Absent): ");
            int status = sc.nextInt();

            if (status == 1) {
                presentCount++;
            }
            else if (status == 0) {
                absentCount++;
            }
            else {
                System.out.println("Invalid input! Please enter only 1 or 0.");
                continue;   // repeat same student
            }

            i++; // move to next student
        }

        System.out.println("\n===== ATTENDANCE REPORT =====");
        System.out.println("Total Students : " + totalStudents);
        System.out.println("Present        : " + presentCount);
        System.out.println("Absent         : " + absentCount);

        sc.close();
    }
}
