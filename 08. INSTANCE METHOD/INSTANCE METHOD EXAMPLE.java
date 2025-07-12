public class Car {
    // Instance variable
    String color;  // color → an instance variable (unique for each object).

    // Constructor
    Car(String carColor) {
        color = carColor;
    }

    // Instance method
    void showColor() {
        System.out.println("Car color is: " + color);
    }

    // main method
    public static void main(String[] args) {
        Car myCar = new Car("Red");  // Creating object  // myCar.showColor() → instance method is called through the object
        myCar.showColor();           // Calling instance method using object  // showColor() → an instance method that uses the instance variable.
    }
}
