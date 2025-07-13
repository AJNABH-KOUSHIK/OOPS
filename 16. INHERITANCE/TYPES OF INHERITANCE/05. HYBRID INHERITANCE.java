// Combination of more than one type of inheritance.
// Note: Java doesn’t support hybrid inheritance with classes, but we can use interfaces.

// 🔵 HYBRID INHERITANCE: IT IS A MIX OF TWO OR MORE OF THE ABOVE TYPES OF INHERITANCE. SINCE JAVA DOESN'T SUPPORT MULTIPLE INHERITANCE WITH CLASSES, HYBRID INHERITANCE INVOLVING MULTIPLE INHERITANCE IS ALSO NOT POSSIBLE WITH CLASSES.
// ✳️ IN JAVA, WE CAN ACHIEVE HYBRID INHERITANCE ONLY THROUGH INTERFACES, IF WE WANT TO INVOLVE MULTIPLE INHERITANCE TO IMPLEMENT HYBRID INHERITANCE.
// 📌 NOTE: IT IS IMPORTANT TO NOTE THAT HYBRID INHERITANCE DOES NOT NECESSARILY REQUIRE THE USE OF MULTIPLE INHERITANCE EXCLUSIVELY.
// ✳️ IT CAN BE ACHIEVED THROUGH A COMBINATION OF MULTILEVEL INHERITANCE AND HIERARCHICAL INHERITANCE WITH CLASSES, HIERARCHICAL AND SINGLE INHERITANCE WITH CLASSES.
// ✳️ IT IS INDEED POSSIBLE TO IMPLEMENT HYBRID INHERITANCE USING CLASSES ALONE, WITHOUT RELYING ON MULTIPLE INHERITANCE TYPE.

interface A {
    void msgA();
}

interface B extends A {
    void msgB();
}

interface C {
    void msgC();
}

// Class implementing multiple interfaces
class D implements B, C {
    public void msgA() {
        System.out.println("Message from A");
    }
    public void msgB() {
        System.out.println("Message from B");
    }
    public void msgC() {
        System.out.println("Message from C");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.msgA();
        obj.msgB();
        obj.msgC();
    }
}
// OUTPUT:
// Message from A
// Message from B
// Message from C
