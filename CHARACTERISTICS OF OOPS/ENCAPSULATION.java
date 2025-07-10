// ENCAPSULATION MEANS WRAPPING DATA (VARIABLES) AND METHODS INTO A 
// SINGLE UNIT (CLASS) AND RESTRICTING ACCESS USING PRIVATE AND PUBLIC.

// Class with encapsulation
class Student {
    // 🔒 Private data (variable) - cannot access directly from outside
    private int age;  //  ← THIS IS THE VARIABLE

    // ✅ Public method to set value (Setter)
    public void setAge(int a) {
        age = a;
    }

    // ✅ Public method to get value (Getter)
    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating object of Student class
        Student s = new Student();

        // Setting data using method (not directly)
        s.setAge(18);  // set age to 18

        // Getting data using method
        System.out.println("Age: " + s.getAge());
    }
}
