public class Animal {
    // Instance variable
    String type;

    // Default constructor (no parameters)
    Animal() {
        type = "Dog";  // Default value assigned
    }

    // Method to display type
    void showType() {
        System.out.println("Animal type is: " + type);
    }

    // main method
    public static void main(String[] args) {
        // Creating object using default constructor
        Animal a1 = new Animal();

        // Calling method
        a1.showType();
    }
}
