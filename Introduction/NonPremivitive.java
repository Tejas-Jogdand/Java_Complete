package Introduction;

public class NonPremivitive {
    public static void main(String[] args) {
        // String greeting = "Hello, World";
        String greeting = new String("Hello, World");
        System.out.println("String: "+greeting+"\nLenght: "+greeting.length());
        System.out.println("Sub String: "+greeting.substring(7,greeting.length()));
        System.out.println("Character at 4: " +greeting.charAt(4));
        System.out.println("Replaced String: "+greeting.replace('o','u'));
        System.out.println("Uppercase String: "+greeting.toUpperCase());
        System.out.println("Lowercase String: "+greeting.toLowerCase());
        System.out.println("Symbols in string: \"Hello\"\tWorld\\");
        System.out.println("Original String: "+greeting);

        int age = 20;
        String sentence = "My age is "+age;
        System.out.println(sentence);
        
    }
}
