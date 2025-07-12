public class BoxExample {
    public static void main(String[] args) {
        // ✅ AUTBOXING: Converting int (primitive) to Integer (object)
        int num = 100;                    // primitive int
        Integer obj = num;               // autoboxing happens here automatically
        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + num);
        System.out.println("Integer object: " + obj);
    }
}
