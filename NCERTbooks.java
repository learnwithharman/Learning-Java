import java.util.ArrayList;
import java.util.Scanner;

// Parent class
class Book {
    String subject;
    int cls;
    double price;

    Book(String subject, int cls, double price) {
        this.subject = subject;
        this.cls = cls;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Subject: " + subject);
        System.out.println("Class: " + cls);
        System.out.println("Price: ₹" + price);
    }
}

// Child class (Inheritance)
class CBSEBook extends Book {
    String board = "CBSE";

    CBSEBook(String subject, int cls, double price) {
        super(subject, cls, price);
    }

    @Override
    void displayBook() {
        System.out.println(board + " -> Class: " + cls +
                " | Subject: " + subject +
                " | Price: $" + price);
    }
}

// Main class
public class NCERTbooks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<CBSEBook> books = new ArrayList<>();

        books.add(new CBSEBook("Maths", 10, 250));
        books.add(new CBSEBook("Maths", 11, 550));
        books.add(new CBSEBook("Maths", 12, 600));
        books.add(new CBSEBook("Science", 10, 300));
        books.add(new CBSEBook("Physics", 11, 420));
        books.add(new CBSEBook("Physics", 12, 510));
        books.add(new CBSEBook("Chemistry", 11, 410));
        books.add(new CBSEBook("Chemistry", 12, 490));
        books.add(new CBSEBook("Biology", 11, 450));
        books.add(new CBSEBook("Computer Science", 11, 450));
        books.add(new CBSEBook("Computer Science", 12, 500));

        System.out.println("---- NCERT BOOK STORE ----");
        System.out.print("Enter Class (10/11/12): ");

        int cls = sc.nextInt();

        System.out.println("\nAvailable Books:");
        boolean found = false;

        for (CBSEBook b : books) {
            if (b.cls == cls) {
                b.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found for the given class.");
        }

        sc.close();
    }
}