// StringBuffer is mutable, meaning it can be modified after creation (unlike String).
Common methods:
// append(String str) – adds text to the end.
// insert(int offset, String str) – inserts at a specific position.
// replace(int start, int end, String str) – replaces part of the buffer.
// delete(int start, int end) – removes characters.
// reverse() – reverses the buffer.a
public class Main {
    public static void main(String[] args) {
        // Creating a StringBuffer object with initial text
        StringBuffer sb = new StringBuffer("Hello");
        // Appending text to the buffer
        sb.append(" World");  // Now the text becomes "Hello World"
        // Inserting text at a specific index
        sb.insert(5, ",");    // Inserts a comma after "Hello", result: "Hello, World"
        // Replacing text between index 6 and 11
        sb.replace(6, 11, "Java");  // Replaces " World" with "Java", result: "Hello,Java"
        // Deleting characters from index 5 to 6 (removing the comma)
        sb.delete(5, 6);       // Result: "HelloJava"
        // Reversing the string
        sb.reverse();          // Result: "avaJolleH"
        // Printing the final result
        System.out.println("Final StringBuffer content: " + sb);
    }
}
