// A class inherits from a child class which itself inherits from another class.
// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Intermediate class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Derived class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // From Animal
        p.bark();  // From Dog
        p.weep();  // From Puppy
    }
}
// OUTPUT:
// Animal eats
// Dog barks
// Puppy weeps
