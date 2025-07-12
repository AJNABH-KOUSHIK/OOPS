public class Book {
    // Instance variable
    String title;

    // ✅ Explicit constructor (written by the programmer)
    Book() {
        title = "Java Basics";  // assigning value
    }

    // Method to display the title
    void showTitle() {
        System.out.println("Book title is: " + title);
    }

    public static void main(String[] args) {
        // Object created using explicit constructor
        Book b1 = new Book();

        // Calling method
        b1.showTitle();
    }
}
