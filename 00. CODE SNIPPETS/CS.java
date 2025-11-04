----------------------------------------------------------------- CLASS VARIABLE ACCESSING IN MAIN METHOD ( CLASSES & OBJECTS )-------------------------------------------------------------
public class Main{
       int age=18; // ✅ 
       static int roll=90;
       String name="Koushik"; 
              public static void main(String[] args){
           Main s1=new Main(); // We can access the variables outisde the main using  either  (Object) or (static) keyword in before data type
          System.out.println(s1.age); // Accessing through Object
          System.out.println(s1.name);
          System.out.println(roll); // Accessing through static
          System.out.println(name); // ❌ without static or without object any method not workable even with proctected keyword also ❌
       }
}
----------------------------------------------------------------- NESTED CLASS ACCESSING IN MAIN METHOD  ( CLASSES & OBJECTS )------------------------------------------------------------------
public class Main{
       int age=18; 
       class Koushik{
              int ageu=3;
              static int rolls=91;
       }
       static class Koushiku{
              int ageuu=4;
              static int rolls=92;
       }
       public static void main(String[] args){
          Koushik v1=new Koushik(); // ❌ Nested Class cannot access through Object
          System.out.println(v1.ageu); // ❌ Nested Class cannot access through Object
          System.out.println(rolls); // ❌ Nested Class cannot access through static also
          Koushiku v2=new Koushiku(); // ✅ Static Nested Class can access through Object
          System.out.println(v2.ageu);  // ✅ Static Nested Class can access through Object
          System.out.println(rolls); // ❌ In Java, to access a static member of a nested static class, you must qualify it with the class name
          System.out.println(Koushiku.rollss);  // ✅ Qualified it with the class name
       }
}
---------------------------------------------------------------- OBJECTS -------------------------------------------------------------------------------------------
Student s1;
 s1 = new Student(); // ✅
 // OR 
Student s1=new Student(); // ✅
Student S1=new Student();
Student S2=S1; // ✅

--------------------------------------------------------------- ACCESS MODIFIERS -------------------------------------------------------------------------------------------
class Person {
    private String name = "Alice";
    public String getName() { return name; } // Public getter
}
public class TestGetter {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.getName()); // ✅ Works
    }
}----------------------------------------------------------------------------- OUTPUT = Alice
class StaticPrivate {
    private static int count = 5;
    public static void display() {
        System.out.println(count); // ✅ Works
    }
}
public class TestStaticPrivate {
    public static void main(String[] args) {
        // System.out.println(StaticPrivate.count); // ❌ Error
        StaticPrivate.display(); // ✅ Works
    }
}--------------------------------------------------------------------------------
class Outer {
    private int x = 10;
    class Inner {
        void show() {
            System.out.println(x); // ✅ Works: Inner can access private of Outer
        }
    }
}
public class TestPrivate {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // System.out.println(outer.x); // ❌ Error: x has private access
        Outer.Inner inner = outer.new Inner();
        inner.show(); // ✅ Works
    }
}
----------------------------------------------------------------- METHOD OVERLOADING -----------------------------------------------------------------------------------------
class Test {
    void fun(float a) {
        System.out.println("float");
    }

    void fun(long a) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.fun(10);  // int literal
    }
}------------------------------------ OUTPUT = long
class Main {
    void fun(float a) { System.out.println("float"); }
    void fun(double a) { System.out.println("double"); }

    public static void main(String[] args) {
        Main t = new Main();
        t.fun((double)10.99999);
    }
}------------------------------------ OUTPUT = double
class Main {
    void fun(byte a) { System.out.println("byte"); }
    void fun(long a) { System.out.println("long"); }

    public static void main(String[] args) {
        Main t = new Main();
        t.fun((byte) 10);     // byte → exact match → byte
        t.fun(10);             // int → int→long → long
        t.fun((long) 10);      // long → exact match → long
        t.fun((short) 10);     // short → short→int→long → long
        t.fun((char) 10);      // char → char→int→long → long
    }
}------------------------------------------------------------
class Demo1 {
    void fun(int a) { System.out.println("int"); }
    void fun(long a) { System.out.println("long"); }
    void fun(float a) { System.out.println("float"); }
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.fun(10);        // int
        d.fun(10L);       // long
        d.fun(10.0f);     // float
    }
}-------------------------------------------------------------
class Demo2 {
    void fun(char c) { System.out.println("char"); }
    void fun(int i) { System.out.println("int"); }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.fun('A');  // char
        d.fun(65);   // int
    }
}-------------------------------------------------------------
class Demo3 {
    void fun(float f) { System.out.println("float"); }
    void fun(double d) { System.out.println("double"); }

    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.fun(10);      // float (int → float preferred over int → double)
        d.fun(10.0);    // double
    }
}-------------------------------------------------------------
class Demo4 {
    void fun(Integer i) { System.out.println("Integer"); }
    void fun(long l) { System.out.println("long"); }

    public static void main(String[] args) {
        Demo4 d = new Demo4();
        d.fun(10); // int → long preferred over autoboxing to Integer
    }
}-------------------------------------------------------------
class Demo5 {
    void fun(int a) { System.out.println("int"); }
    void fun(int... a) { System.out.println("varargs"); }

    public static void main(String[] args) {
        Demo5 d = new Demo5();
        d.fun(10);  // exact match → int
    }
}-------------------------------------------------------------
class Demo7 {
    void fun(int a, long b) {}
    void fun(long a, int b) {}

    public static void main(String[] args) {
        Demo7 d = new Demo7();
        // d.fun(10, 10); // ❌ ambiguous
    }
}----------------------------------------------------------
class Demo8 {
    void fun(String s) { System.out.println("String"); }
    void fun(Integer i) { System.out.println("Integer"); }

    public static void main(String[] args) {
        Demo8 d = new Demo8();
        // d.fun(null); // ❌ ambiguous
    }
}-----------------------------------------------------------
class Demo10 {
    void fun(Long l) { System.out.println("Long"); }
    void fun(double d) { System.out.println("double"); }

    public static void main(String[] args) {
        Demo10 d = new Demo10();
        d.fun(10);  // int → double (widening preferred over boxing to Long)
    }
}-----------------------------------------------------------
class Tricky {
    void show(Integer i) {
        System.out.println("Integer");
    }
    void show(long l) {
        System.out.println("long");
    }
    void show(double d) {
        System.out.println("double");
    }
    public static void main(String[] args) {
        Tricky t = new Tricky();
        t.show(10);          // Integer
        t.show(10L);         // ✅ long literal
        t.show(10.0);        // ✅ double literal
        t.show(null);        // ❌ Will this compile?
    }
}
---------------------------------------------------------------
class VarArgsTrick {
    static void test(int... a) {
        System.out.println("int varargs");
    }
    static void test(Integer a, Integer b) {
        System.out.println("Integer, Integer");
    }
    static void test(Integer... a) {
        System.out.println("Integer varargs");
    }
    public static void main(String[] args) {
        test(1, 2);      // ✅ Which method is called? int varargs
        test(1);         // ✅ Which method is called? int varargs
        test();          // ✅ Which method is called? int varargs
        test(null, null); // ❌ Will this compile? Compilation error
    }
}---------------------------------------------------------------------------
class MainS {
    void fun(Long a) {
        System.out.println("Long object");
    }
    void fun(double a) {
        System.out.println("double primitive");
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.fun(10);  // int literal
    } // ✅  double primitive
}--------------------------------------------------------------------------
class Demo { 
public void show(int x) { 
System.out.println("In int" + x); 
} 
public void show(String s) { 
System.out.println("In String" + s); 
} 
public void show(byte b) { 
System.out.println("In byte" + b); 
} 
}
class UseDemo { 
public static void main(String[] args){
    byte a = 25; 
Demo obj= new Demo();
obj.show('A');
}  // ✅  In int  65
} -------------------------------------------------------------------------

----------------------------------------------------------------- THIS KEYWORD -----------------------------------------------------------------------------------------
public class MainS {
    int age = 18;
    String name = "Koushik"; 
    public static void main(String[] args){
        this.age = age; // ❌ this cannot be used in a static context
        this.name = name; 
    }
}--------------------------------------------------------------------------------
class Person {
    int age;
    String name;
    Person(int age, String name) {
        // 'this' distinguishes instance variables from parameters
        this.age = age;
        this.name = name;
    }
    void show() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
    public static void main(String[] args) {
        Person p = new Person(18, "Koushik");
        p.show();  // Output: Name: Koushik, Age: 18
    }
}--------------------------------------------------------------------------------









