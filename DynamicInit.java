import java.util.Scanner;
public class DynamicInit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perpendicular;
        double base;
        double hypotenuse;
        System.out.print("Enter the value of perpendicular: ");
        perpendicular = sc.nextDouble();
        System.out.print("Enter the value of base: ");
        base = sc.nextDouble();
        hypotenuse = Math.sqrt((perpendicular * perpendicular) + (base * base));
        System.out.println("The value of hypotenuse is: " + hypotenuse + "units");
        sc.close();
    }
}