public class BoxExample {
    public static void main(String[] args) {
        
        // ✅ UNBOXING: Converting Integer (object) back to int (primitive)
        Integer obj2 = 200;              // Integer object
        int num2 = obj2;                 // unboxing happens automatically

        System.out.println("\nUnboxing:");
        System.out.println("Integer object: " + obj2);
        System.out.println("Primitive int: " + num2);
    }
}
