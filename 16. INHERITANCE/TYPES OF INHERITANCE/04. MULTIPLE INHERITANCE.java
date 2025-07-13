// 💬 “Java does not support multiple inheritance with classes” – Explanation:
// This means that in Java, a class cannot inherit from more than one class at the same time.
// In other words, a single class can only extend one parent class, not two or more.
// 🤔 Why is this restriction there?
// Because of something called the Diamond Problem.
// This happens when two parent classes have the same method, and a child class tries to inherit from both — it creates confusion about which method to use.
// 🔒 To avoid this confusion:
// Java designers decided not to allow multiple inheritance with classes. This makes things:
// Simpler
// Clearer
// Less error-prone

// Interface 1
interface Printable {
    void print();
}

// Interface 2
interface Showable {
    void show();
}

// Class implementing both interfaces
class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }
    public void show() {
        System.out.println("Showing...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
    }
}
// OUTPUT:
// Printing...
// Showing...
