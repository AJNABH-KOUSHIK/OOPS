import java.util.ArrayList;

public class WrapperClassFeatures {
    public static void main(String[] args) {

        // 1. Useful Methods
        // Converting a String to an int using Integer.parseInt()
        String numberStr = "123";
        int number = Integer.parseInt(numberStr); // Wrapper method: parseInt
        System.out.println("Converted String to int: " + number);

        // Converting a double to a String using Double.toString()
        double doubleValue = 10.5;
        String doubleStr = Double.toString(doubleValue); // Wrapper method: toString
        System.out.println("Converted double to String: " + doubleStr);

        // 2. Immutable Objects
        // Wrapper objects are immutable (cannot be changed once created)
        Integer immutableInt = 50; // Autoboxing
        // immutableInt = immutableInt + 10; --> creates a new object internally

        // 3. Usage in Collections
        // Collections like ArrayList only work with objects, not primitives
        ArrayList<Integer> list = new ArrayList<>(); // Using wrapper class Integer
        list.add(10); // Autoboxing: primitive int is converted to Integer
        list.add(20);
        System.out.println("ArrayList contents: " + list);

        // Java automatically converts between primitive types and their wrapper classes
        Integer autoBoxed = 25; // int to Integer (Autoboxing)
        int unBoxed = autoBoxed; // Integer to int (Unboxing)
        System.out.println("Autoboxed Integer: " + autoBoxed);
        System.out.println("Unboxed int: " + unBoxed);
    }
}
