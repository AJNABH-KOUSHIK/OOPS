// Multiple child classes inherit from a single parent class.
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Child 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
// OUTPUT:
// Animal eats
// Dog barks
// Animal eats
// Cat meows
