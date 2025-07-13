// Access Level: Accessible from anywhere (inside class, other class, or other package).
public class PublicExample {

    // public variable
    public int num = 100;

    public void display() {
        System.out.println("Public Method Called");
    }

    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println("Public Variable: " + obj.num); // Accessible ✅
        obj.display(); // Accessible ✅
    }
}
