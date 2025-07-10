// Abstract class - hides complex details
abstract class Message {
    // Abstract method - only the name is shown, not how it works
    abstract void sendMessage();
}

// Concrete class - provides the actual implementation
class SMS extends Message {
    // Implementation of abstract method
    public void sendMessage() {
        // Complex logic hidden from user (simulated)
        System.out.println("Sending SMS to the user...");
    }
}

public class Main {
    public static void main(String[] args) {
        // User just creates an object and calls the method
        // User sees only the action, not internal logic
        Message msg = new SMS();
        msg.sendMessage();  // 👉 Only essential action is shown
    }
}
