// Accessible only within the same package.
class DefaultExample {

    // default variable (no access modifier)
    int num = 300;

    void display() {
        System.out.println("Default Method Called");
    }

    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println("Default Variable: " + obj.num); // Accessible ✅ (same class)
        obj.display(); // Accessible ✅
    }
}
