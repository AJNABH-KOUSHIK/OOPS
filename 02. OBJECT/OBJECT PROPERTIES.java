// AN OBJECT CONSIST OF 3 MAIN PROPERTIES
// THEY ARE STATE == IT IS REPRESENTED BY ATTRIBUTES OF AN OBJECT
//  BEHAVIOUR == IT IS REPRESENTED BY METHODS OF AN OBJECT
//  IDENTITY == GIVES AN UNIQUE NAME OF AN OBJECT , ENABLES ONE OBJECT TO INTERACT WITH OTHER OBJECT

// Class definition
class Student {
    // State (data members)
    String name;
    int age;

    // Constructor to set initial state
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Behavior (method)
    void study() {
        System.out.println(name + " is studying.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating two different objects (each has its own identity)
        Student s1 = new Student("Koushik", 20);
        Student s2 = new Student("Anjali", 22);

        // Accessing state
        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age);

        // Performing behavior
        s1.study();
        s2.study();

        // Identity: printing object references (memory location)
        System.out.println("s1 identity: " + s1);
        System.out.println("s2 identity: " + s2);
    }
}
