// Accessible only within the same class
public class PrivateExample {

    // private variable
    private int num = 200;

    // private method
    private void display() {
        System.out.println("Private Method Called");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println("Private Variable: " + obj.num); // Accessible ✅ (within class)
        obj.display(); // Accessible ✅ (within class)
    }
}
