// IS A SPECIAL LITERAL THAT MEANS A REFERENCE VARIABLE DOES NOT POINT TO 
// ANY OBJECT. IT REPRESENTS THE ABSENCE OF A VALUE OR NO REFERENCE.

class Car {
    String color;
}

public class Main {
    public static void main(String[] args) {
        Car myCar = null;  // Reference variable 'myCar' points to nothing (null)
        // Now myCar does NOT refer to any Car object
      // We can assign & also cast null to non primitive data type
    // We cannot assign null to primitive data type
        System.out.println(myCar);  // Output: null
    }
}
