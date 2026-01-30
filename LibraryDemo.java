// Real-world class: Book
class Book {

    // DATA (state of object)
    // private → direct access allowed nahi (data hiding)
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor → object bante hi data set karta hai
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // book initially available
    }

    // Method → book issue karne ke liye
    void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Method → book return karne ke liye
    void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    // Method → book details show karne ke liye
    void showDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Status : " + (isAvailable ? "Available" : "Issued"));
    }
}

// Main class
public class LibraryDemo {

    public static void main(String[] args) {

        // Object creation (real book in memory)
        Book b1 = new Book("Java Basics", "James Gosling");

        b1.showDetails();   // book details
        b1.issueBook();     // issue book
        b1.showDetails();   // status changed
        b1.returnBook();    // return book
        b1.showDetails();   // available again
    }
}
