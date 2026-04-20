package threeB5;

import java.util.*;

public class RemoveWhitespaceDemo {

    // User-defined function
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        String input = "  Java   Programming   Language  ";

        String result = removeWhitespace(input);

        System.out.println("Original String: '" + input + "'");
        System.out.println("After removing whitespace: '" + result + "'");
    }
}