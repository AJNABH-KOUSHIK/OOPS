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
// STRING BUILDER IS FASTER THAN STRING BUFFER. EVEN STRING BUFFER IS MULTI-THREADED 
// WHERE IT ALLOWS MULTIPLE PROGRAMS TO EXECUTE THEN WHY STRING BUILDER IS FASTER ?
// ANS == 
// MULTI-THREADING IS FASTER FOR TASKS THAT CAN RUN IN PARALLEL.
// STRING BUFFER → THREAD SAFE, SYNCHRONIZED, MULTI-THREAD.
// STRING BUILDER → NOT THREAD SAFE, NOT SYNCHRONIZED, SINGLE THREAD.
// SYNCHRONIZED MEANS THREADS MUST WAIT THEIR TURN. SO IF MULTIPLE THREADS TRY TO APPEND AT THE SAME TIME – THEY CAN’T DO IT IN PARALLEL. ONLY ONE AT A TIME CAN ACCESS IT.
// SO STRING BUILDER IS FASTER FOR SINGLE-THREADED WORK BECAUSE IT SKIPS UNNECESSARY SYNCHRONIZATION.
