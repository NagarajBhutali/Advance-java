package threeA;

import java.util.*;

public class StringOps {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("s1: " + s1 + ", s2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Char at index 1: " + s1.charAt(1));

        // 3. String Comparison
        String s3 = "hello";
        System.out.println("Equals: " + s1.equals(s3));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

        // 4. String Searching
        System.out.println("Index of 'l': " + s1.indexOf('l'));
        System.out.println("Contains 'He': " + s1.contains("He"));

        // 5. Substring Operations
        System.out.println("Substring (1,4): " + s1.substring(1, 4));

        // 6. String Modification
        System.out.println("Replace l->x: " + s1.replace('l', 'x'));
        System.out.println("Uppercase: " + s1.toUpperCase());

        // 7. Whitespace Handling
        String s4 = "   Java Programming   ";
        System.out.println("Before trim: '" + s4 + "'");
        System.out.println("After trim: '" + s4.trim() + "'");

        // 8. String Concatenation
        String concat = s1.concat(" " + s2);
        System.out.println("Concatenated: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" Middle").append(" End");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Marks: %d", "Nagaraj", 90);
        System.out.println("Formatted: " + formatted);

        // 12. Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}