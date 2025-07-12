public class Geeks {
    public static void main(String[] args) {
        // ✅ Primitive data type
        int b;

        // ✅ Wrapper class (Integer is a wrapper for int)
        Integer a;

        // ✅ Assigning value to primitive
        b = 357;

        // ✅ Auto-boxing: converting int (primitive) to Integer (object)
        a = b;

        // ✅ Printing both values
        System.out.println("The primitive int b is: " + b);
        System.out.println("The Integer object a is: " + a);
    }
}
