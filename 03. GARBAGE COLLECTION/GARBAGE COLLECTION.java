// GARBAGE COLLECTION IN JAVA IS AUTOMATIC MEMORY MANAGEMENT. 
// WHEN AN OBJECT IS NO LONGER USED OR REFERENCED, JAVA AUTOMATICALLY DELETES IT FROM MEMORY TO FREE UP SPACE.

public class SimpleGC {
    public static void main(String[] args) {
        // Create first object and reference it by 'obj'
        String obj = new String("Hello");

        // Now, assign 'obj' to new object
        obj = new String("World");

        // The first "Hello" object is now unreachable and eligible for garbage collection

        System.gc(); // Suggest JVM to run GC (not guaranteed immediately)

        System.out.println(obj);  // Output: World
    }
}









