public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "Hello World";

        // 1. length()
        System.out.println(str.length());
        // OUTPUT: 11

        // 2. charAt(index)
        System.out.println(str.charAt(0));
        // OUTPUT: H

        // 3. substring(beginIndex)
        System.out.println(str.substring(6));
        // OUTPUT: World

        // 4. substring(beginIndex, endIndex)
        System.out.println(str.substring(0, 5));
        // OUTPUT: Hello

        // 5. contains(CharSequence)
        System.out.println(str.contains("World"));
        // OUTPUT: true

        // 6. equals(Object)
        System.out.println(str.equals("Hello World"));
        // OUTPUT: true

        // 7. equalsIgnoreCase(String)
        System.out.println(str.equalsIgnoreCase("hello world"));
        // OUTPUT: true

        // 8. toUpperCase()
        System.out.println(str.toUpperCase());
        // OUTPUT: HELLO WORLD

        // 9. toLowerCase()
        System.out.println(str.toLowerCase());
        // OUTPUT: hello world

        // 10. indexOf(char)
        System.out.println(str.indexOf('o'));
        // OUTPUT: 4

        // 11. lastIndexOf(char)
        System.out.println(str.lastIndexOf('o'));
        // OUTPUT: 7

        // 12. startsWith(prefix)
        System.out.println(str.startsWith("Hello"));
        // OUTPUT: true

        // 13. endsWith(suffix)
        System.out.println(str.endsWith("World"));
        // OUTPUT: true

        // 14. isEmpty()
        System.out.println(str.isEmpty());
        // OUTPUT: false

        // 15. trim() - removes leading/trailing spaces
        String s2 = "   Java   ";
        System.out.println(s2.trim());
        // OUTPUT: Java

        // 16. replace(oldChar, newChar)
        System.out.println(str.replace('l', 'x'));
        // OUTPUT: Hexxo Worxd

        // 17. replaceAll(regex, replacement)
        System.out.println(str.replaceAll("o", "O"));
        // OUTPUT: HellO WOrld

        // 18. split(regex)
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        // OUTPUT:
        // Hello
        // World

        // 19. concat(String)
        System.out.println(str.concat(" Java"));
        // OUTPUT: Hello World Java

        // 20. compareTo(String)
        System.out.println(str.compareTo("Hello World"));
        // OUTPUT: 0

        // 21. compareToIgnoreCase(String)
        System.out.println(str.compareToIgnoreCase("hello world"));
        // OUTPUT: 0

        // 22. toCharArray()
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        // OUTPUT: H e l l o   W o r l d 

        System.out.println(); // Just to add a newline

        // 23. valueOf(int/double/char etc)
        int num = 123;
        String s3 = String.valueOf(num);
        System.out.println(s3);
        // OUTPUT: 123

        // 24. format()
        String formatted = String.format("My name is %s and age is %d", "Leela", 21);
        System.out.println(formatted);
        // OUTPUT: My name is Leela and age is 21

        // 25. join()
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println(joined);
        // OUTPUT: Java-is-fun
    }
}
