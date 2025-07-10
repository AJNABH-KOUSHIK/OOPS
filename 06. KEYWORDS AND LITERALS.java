// NEW IS A KEYWORD FOR CREATING NEW OBJECTS AT RUNTIME.
// IT IS USED TO CREATE OBJECTS DYNAMICALLY ON THE HEAP.

// Class definition
class Car {
    String color;  // Property to store color of the car
}

public class Main {
    public static void main(String[] args) {
        // Using 'new' keyword to create a new object of class Car
        Car myCar = new Car();  // 'myCar' is a reference variable pointing to the new Car object
        
        // Setting the property of the object
        myCar.color = "Red";
        
        // Printing the property of the object
        System.out.println("Car color is: " + myCar.color);
    }
}
