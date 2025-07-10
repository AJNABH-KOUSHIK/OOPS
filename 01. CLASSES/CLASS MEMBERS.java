// Here is a complete Java example that includes:
// ✅ Data Member
// ✅ Method
// ✅ Constructor
// ✅ Nested Class
// ✅ Interface
// THIS ARE CALLED CLASS MEMBERS OR MEMBERS OF CLASS
// Interface declaration
interface Animal {
    // Interface method (no body)
    void makeSound();
}
// Outer class
class Person {
    // Data member
    String name;
    // Constructor
    Person(String name) {
        this.name = name;
    }
    // Method
    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
    // Nested class (Inner class)
    class Address {
        String city = "Hyderabad";
        void showCity() {
            System.out.println(name + " lives in " + city);
        }
    }
}
// Class that implements the interface
class Dog implements Animal {
    // Implementation of interface method
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}
// Main class
public class Main {
    public static void main(String[] args) {
        // Creating object of outer class
        Person p1 = new Person("Koushik");
        // Calling method
        p1.sayHello();
        // Creating object of nested class
        Person.Address addr = p1.new Address();
        addr.showCity();
        // Creating object of Dog class which implements interface
        Dog d = new Dog();
        d.makeSound();
    }
}
