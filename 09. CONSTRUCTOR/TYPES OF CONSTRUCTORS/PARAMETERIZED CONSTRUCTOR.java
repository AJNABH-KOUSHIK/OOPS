public class Student {
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    Student(String studentName, int studentAge) {
        name = studentName;  // Assigning values to instance variables
        age = studentAge;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);  // HAVING PARAMETERS
        System.out.println("Age: " + age);
    }

    // main method
    public static void main(String[] args) {
        // Creating an object using parameterized constructor
        Student s1 = new Student("Koushik", 20);

        // Calling display method
        s1.display();
    }
}
