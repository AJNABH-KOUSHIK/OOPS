// A Constructor is a special method that is used to initialize object

 // The constructor of a class must have the same name as the class in which it resides.
 // Constructors do not have any return type, not even void.
 // The main purpose of a constructor is to initialize the object, not to return a value.
 // One object can be called one time only.
 // When an object of a class is created, the constructor is called automatically to initialize the object's attributes.


import java.io.*;  // Importing input-output classes

// Driver class
class Geeks {

    // Constructor
    Geeks() {
        super();  // Calls parent class constructor (optional here)
        System.out.println("Constructor Called");
    }

    // Main method
    public static void main(String[] args) {
        Geeks geek = new Geeks();  // Creating object, constructor is automatically called
    }
}
