public class Student {
    // Instance variables
    String name;
    int age;

    // ✅ Parameterized constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // ✅ Copy constructor (takes another Student object)
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating first object using parameterized constructor
        Student s1 = new Student("Koushik", 20);

        // Creating second object using copy constructor
        Student s2 = new Student(s1);

        // Displaying both objects
        System.out.println("Original Student:");
        s1.display();

        System.out.println("\nCopied Student:");
        s2.display();
    }
}
