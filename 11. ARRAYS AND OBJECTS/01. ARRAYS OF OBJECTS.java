// Class to represent a student
class Student {
    int id;          // To store student's ID
    String name;     // To store student's name

    // Constructor to initialize student object
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating and initializing an array of Student objects
        Student[] students = new Student[3]; // Array to hold 3 Student objects

        // Assigning Student objects to the array elements
        students[0] = new Student(1, "Ram");     // Creates a Student object and assigns to index 0
        students[1] = new Student(2, "Shyam");   // Creates a Student object and assigns to index 1
        students[2] = new Student(3, "Alice");   // Creates a Student object and assigns to index 2

        // Displaying the details of each student using for-each loop
        for (Student s : students) {
            s.display();
        }
    }
}
