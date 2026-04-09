class Student {

    // 🔹 Access Modifiers
    public String name;      // anywhere access
    private int age;         // only inside this class
    protected String course; // same package / subclass

    // 🔹 Constructor
    Student(String name, int age, String course) {
        this.name = name;     // 'this' current object ko refer karta hai
        this.age = age;
        this.course = course;
    }

    // 🔹 Getter (private variable access karne ke liye)
    public int getAge() {
        return this.age;
    }

    // 🔹 Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // 🔹 Normal Method
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Course: " + this.course);
    }

    // 🔹 Method Overloading (same name, different params)
    public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String msg) {
        System.out.println("Hello, " + msg);
    }
}

public class accessModifiers {
    public static void main(String[] args) {

        // 🔹 Object creation
        Student s1 = new Student("Harman", 20, "CSE");

        // 🔹 Access public variable
        System.out.println(s1.name);

        // 🔹 Private direct access ❌ (error hota)
        // System.out.println(s1.age);

        // ✔ Access via getter
        System.out.println(s1.getAge());

        // 🔹 Setter use
        s1.setAge(21);

        // 🔹 Call method
        s1.display();

        // 🔹 Method overloading call
        s1.greet();
        s1.greet("Welcome to Java");

    }
}