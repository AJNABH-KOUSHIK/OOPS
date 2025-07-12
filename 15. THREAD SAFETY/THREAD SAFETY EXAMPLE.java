// Thread safety refers to the ability of a piece of code, method, or class 
// to function correctly during simultaneous execution by multiple threads.
// A class that represents a shared counter
class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    // Method to get current count
    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create a shared object of Counter
        Counter counter = new Counter();

        // Creating a thread that increments counter 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Another thread doing the same
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        // Print final value of count
        System.out.println("Final Count: " + counter.getCount());
    }
}
