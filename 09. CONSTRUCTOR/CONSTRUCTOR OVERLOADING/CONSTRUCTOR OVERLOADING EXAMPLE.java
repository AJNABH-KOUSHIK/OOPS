// Class with overloaded constructors
class Casio {
    int num1;
    int num2;
    String operation;

    // ✅ Constructor 1: No arguments (default)
    public Casio() {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }

    // ✅ Constructor 2: One argument
    public Casio(int i) {
        num1 = i;
        num2 = 0;
        operation = "Nothing"; // Default operation
    }

    // ✅ Constructor 3: Two arguments
    public Casio(int i, int j) {
        num1 = i;
        num2 = j;
        operation = "Nothing"; // Default operation
    }

    // Method to display values
    void show() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("operation: " + operation);
    }
}

// Main class to test
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        // Creating object using no-arg constructor
        Casio obj1 = new Casio();

        // Creating object using 1-arg constructor
        Casio obj2 = new Casio(10);

        // Creating object using 2-arg constructor
        Casio obj3 = new Casio(5, 15);

        // Displaying values
        System.out.println("Using default constructor:");
        obj1.show();

        System.out.println("\nUsing 1-argument constructor:");
        obj2.show();

        System.out.println("\nUsing 2-argument constructor:");
        obj3.show();
    }
}
