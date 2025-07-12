public class Book {
    // Instance variable
    String title;

    // No constructor is written here — so Java adds an implicit one!

    // Method to display book info
    void showTitle() {
        System.out.println("Book title is: " + title);
    }

    public static void main(String[] args) {
        // Using implicit constructor
        Book b1 = new Book();

        // title is not assigned yet, so it's null
        b1.showTitle();
    }
}
