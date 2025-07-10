// Static Method:

// A static method in Java belongs to the class, not to an object.
//  It can be called using the class name without creating an object.

// Example 1:
class Test {
    public static void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        // Calling static method using class name
        Test.greet();

        // or directly inside the class
        greet();

        // You can also call it using class name explicitly
        MyClass.greet();  // (assuming MyClass exists with greet method)
    }
}

// Example 2:
class Test {
    public void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        // Non-static method call requires object
        Test t = new Test();  // Create object
        t.greet();            // Call non-static method using object
    }
}
