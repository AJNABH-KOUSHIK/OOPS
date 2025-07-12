// StringBuilder is mutable, meaning the content can be changed after creation.
// It is faster than StringBuffer but not thread-safe.
// Useful when you're performing many string modifications in a single-threaded environment.
// Demonstration of StringBuilder in Java
public class Geeks {
    public static void main(String[] args) {

        // Create a new StringBuilder object with initial content "Hello"
        StringBuilder sb = new StringBuilder("Hello");

        // Print the initial content of the StringBuilder
        System.out.println("Initial: " + sb);
        // OUTPUT: Initial: Hello

        // Append a string to the StringBuilder
        sb.append(" is awesome!");

        // Print the content after appending
        System.out.println("After append: " + sb);
        // OUTPUT: After append: Hello is awesome!
    }
}
