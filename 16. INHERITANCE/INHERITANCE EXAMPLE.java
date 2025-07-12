// Inheritance is one of the four main pillars of Object-Oriented Programming (OOP).
// It is a mechanism in Java by which one class can acquire (inherit) the properties and behaviors (fields and methods) of another class.

// Base class (also called Parent or Superclass)
class Animal {
    // Method of the parent class
    void sound() {
        System.out.println("Animals make sound");
    }
}
// Animal is the base class.
// Dog is the child class that inherits from Animal using extends.
// The Dog class can use both its own method bark() and the inherited method sound() from Animal

// Derived class (also called Child or Subclass)
class Dog extends Animal {
    // Method of the child class
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to run the program
public class InheritanceExample {
    public static void main(String[] args) {

        // Create an object of Dog class
        Dog myDog = new Dog();

        // Call method from parent class
        myDog.sound();  
        // OUTPUT: Animals make sound

        // Call method from child class
        myDog.bark();   
        // OUTPUT: Dog barks
    }
}
