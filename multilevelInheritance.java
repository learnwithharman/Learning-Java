// Grandparent class
class GrandParent {
    String familyName = "Kumar";

    GrandParent() {
        System.out.println("GrandParent Constructor Called");
    }

    void showFamily() {
        System.out.println("Family Name: " + familyName);
    }
}


// Parent class (inherits GrandParent)
class Parent extends GrandParent {
    String fatherName;

    // Constructor with parameter
    Parent(String fatherName) {
        super();                           // calls GrandParent constructor
        this.fatherName = fatherName;     // this refers to current class variable
        System.out.println("Parent Constructor Called");
    }

    void showDetails() {
        System.out.println("Father Name: " + fatherName);
    }

    // Method to be overridden
    void profession() {
        System.out.println("Parent is a Businessman");
    }
}


// Child class (inherits Parent)
class Child extends Parent {
    String childName;

    // Constructor with parameter
    Child(String fatherName, String childName) {
        super(fatherName);                           // calls Parent constructor
        this.childName = childName;
        System.out.println("Child Constructor Called");
    }

    void showChild() {
        System.out.println("Child Name: " + childName);
    }

    // Method Overriding
    void profession() {
        System.out.println("Child is a Software Engineer");

        // calling parent method using super
        super.profession();
    }
}

// Main class
public class multilevelInheritance {
    public static void main(String[] args) {

        // Creating object of Child class
        Child c = new Child("Baljinder", "Harman");

        System.out.println("\n--- Accessing Data ---");

        c.showFamily();   // from GrandParent
        c.showDetails();  // from Parent
        c.showChild();    // from Child

        System.out.println("\n--- Method Overriding ---");
        c.profession();   // overridden method
    }
}