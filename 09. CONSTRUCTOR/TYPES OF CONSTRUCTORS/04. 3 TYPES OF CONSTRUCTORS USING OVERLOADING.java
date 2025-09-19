package Lab6;

class Employee {
    int id;
    String name;
    int salary;

    // Default constructor
    Employee() {
        this.id = 0;
        this.name = "Not Assigned";
        this.salary = 0;
    }

    // Constructor with id & name
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 30000;
    }

    // Constructor with id, name & salary
    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = (salary < 0) ? 0 : salary; // prevent negative
    }

    // Display method
    void display() {
        System.out.println("The id of the Employee: " + this.id);
        System.out.println("The name of the Employee: " + this.name);
        System.out.println("The salary of the Employee: " + this.salary);
        System.out.println("---------------------------");
    }
}

// Main class
public class TaskB {
    public static void main(String[] args) {
        Employee e1 = new Employee();                      // default
        Employee e2 = new Employee(1, "Vijju");            // id+name
        Employee e3 = new Employee(2, "Kannu", 10000);     // id+name+salary

        e1.display();
        e2.display();
        e3.display();
    }
}
