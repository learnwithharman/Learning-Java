import java.util.Arraylist;
import java.util.Scanner;

class book{
    String Subject;
    int Class;
    double price;
    book(String Subject, int Class, double price){
        this.Subject = Subject;
        this.Classs = Class;
        this.price = price;
    }
    void displaybook(){
        System.out.println("Subject: " + Subject);
        System.out.println("Class: " + Class);
        System.out.println("Price: " + price+"₹");
    }
}

// Child class (Inheritance)
class CBSEbook extends book{
    String board ="CBSE";
    CBSEbook(String Sunject, int Class, double price){
        super(Subject, Class, Price);
    }
    @Override
    void displaybook(){
        super.displaybook();
        System.out.println(board+ "->Class;" + Class + "| Subject: " + Subject + "| Price: " + price);

    }
);


}

public class NCERTbooks {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<CBSEbook> books = new ArrayList<>();
        books.add(new CBSEbook ("Maths", 10, 250));
        books.add(new CBSEbook ("Maths", 11, 550));
        books.add(new CBSEbook ("Maths", 12, 600));
        books.add(new CBSEbook ("Science", 10,300 ));
        books.add(new CBSEbook ("Physics", 11, 420));
        books.add(new CBSEbook ("Physics", 12, 510));
        books.add(new CBSEbook ("Chemistry", 11, 410));
        books.add(new CBSEbook ("Chemistry", 12, 490));
        books.add(new CBSEbook ("Biology", 11, 450));
        books.add(new CBSEbook ("Computer Science", 11, 450));
        books.add(new CBSEbook ("Computer Science", 12, 500));

        System.out.println("---- NCERT BOOK STORE ----");
        System.out.println("Enter CLass (10/11/12):");
        int cls =sc.nextInt();
        System.out.println("\nAvailable Books");
        boolean found = false;
        for(CBSEbook b : books){
            if(b.Class == cls){
                b.displaybook();
                found = true;
            }
        }
        if(!found){
            System.out.println("No books found for the given class.");
        }
        sc.close();

    }
    
}

