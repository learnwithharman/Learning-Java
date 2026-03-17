import java.util.ArrayList;
import java.util.Scanner;

// Class representing an electronic product
class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stock;

    public Product(int id, String name, String category, double price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Method to display product details
    public void displayProduct() {
        System.out.printf("ID: %d | Name: %s | Category: %s | Price: $%.2f | Stock: %d\n", 
                          id, name, category, price, stock);
    }
}

// Main class representing the Electronic Shop
public class electronicshop {
    private ArrayList<Product> inventory = new ArrayList<>();
    private int nextId = 1;

    // Method to add a new product
    public void addProduct(String name, String category, double price, int stock) {
        Product newProduct = new Product(nextId++, name, category, price, stock);
        inventory.add(newProduct);
        System.out.println("Product '" + name + "' added successfully!");
    }

    // Method to display all products in inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\n--- Current Inventory ---");
            for (Product p : inventory) {
                p.displayProduct();
            }
            System.out.println("-------------------------");
        }
    }

    // Method to search for a product by name
    public void searchProduct(String name) {
        boolean found = false;
        System.out.println("\n--- Search Results ---");
        for (Product p : inventory) {
            // Check if name contains the search term, ignoring case
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                p.displayProduct();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        electronicshop shop = new electronicshop();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the Electronic Shop Management System!");

        // Adding some default items
        shop.addProduct("Laptop", "Computers", 999.99, 10);
        shop.addProduct("Smartphone", "Mobile", 599.50, 20);
        shop.addProduct("Headphones", "Audio", 149.99, 50);

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. View Inventory");
            System.out.println("2. Add a Product");
            System.out.println("3. Search for a Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    shop.displayInventory();
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    double price = 0;
                    int stock = 0;
                    try {
                        System.out.print("Enter price: ");
                        price = Double.parseDouble(scanner.nextLine());
                        System.out.print("Enter stock quantity: ");
                        stock = Integer.parseInt(scanner.nextLine());
                        shop.addProduct(name, category, price, stock);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format for price or stock.");
                    }
                    break;
                case 3:
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    shop.searchProduct(searchName);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting... Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from 1 to 4.");
            }
        }
        scanner.close();
    }
}
