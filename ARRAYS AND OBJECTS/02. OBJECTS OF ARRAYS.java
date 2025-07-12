// Class to hold student data using arrays
class StudentData {
    String[] names;   // Array to store student names
    int[] ages;       // Array to store student ages
    double[] marks;   // Array to store student marks
}

public class Main {
    public static void main(String[] args) {

        // Creating an object of StudentData
        StudentData data = new StudentData();

        // Initializing the arrays with values
        data.names = new String[] {"Alice", "Bob", "Charlie"};
        data.ages = new int[] {20, 21, 22};
        data.marks = new double[] {85.5, 90.0, 78.2};

        // Printing data for the first student (index 0)
        System.out.println(data.names[0] + " is " + data.ages[0] + 
                           " years old and scored " + data.marks[0]);
    }
}
