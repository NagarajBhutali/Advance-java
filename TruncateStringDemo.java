package threeC2;

import java.util.*;

public class TruncateStringDemo {

    // User-defined function
    public static String truncate(String str, int maxLength) {

        if (str == null) return null;

        // If string is already short, return as is
        if (str.length() <= maxLength) {
            return str;
        }

        // If maxLength is too small, just return dots
        if (maxLength <= 3) {
            return "...";
        }

        // Truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {

        String input = "Java programming is interesting";
        int length = 15;

        String result = truncate(input, length);

        System.out.println("Original: " + input);
        System.out.println("Truncated: " + result);
    }
}