// Accessible in same class
// Accessible in same package
// Accessible in subclass from different package
  
public class ProtectedExample {

    // protected variable
    protected int num = 400;

    // protected method
    protected void display() {
        System.out.println("Protected Method Called");
    }

    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Protected Variable: " + obj.num); // Accessible ✅ (same class)
        obj.display(); // Accessible ✅
    }
}
