public class Example {
    int num;  // instance variable stored in Heap
    
    public static void main(String[] args) {
        // 'obj' is a reference variable (compile-time) Stored ( Stack memory )
        Example obj = new Example();

        // 'new Example()' creates object dynamically in heap at runtime ( Heap Memory )
        obj.num = 5;  // storing data inside the object in heap

        System.out.println("Value: " + obj.num);
    }
}
