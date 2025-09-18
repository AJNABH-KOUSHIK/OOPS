class Person {
    String name;
    String city;

    Person(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
public class CopyExample {
    public static void main(String[] args) {
        Person p1 = new Person("John", "New York");
        // Shallow copy → just assigning reference
        Person shallowCopy = p1;
        // Deep copy → creating a new object with same values
        Person deepCopy = new Person(p1.name, p1.city);
        // Change original object
        p1.city = "Los Angeles";
        System.out.println("Original Person: " + p1.city);
        System.out.println("Shallow Copy: " + shallowCopy.city); // same change
        System.out.println("Deep Copy: " + deepCopy.city);       // independent
    }
}
