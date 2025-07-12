// One child class inherits from one parent class
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited method
        d.bark(); // Own method
    }
}
// OUTPUT:
// Animal eats food
// Dog barks
