package threeB2;

import java.util.*;

public class CountSubstring {

    // User-defined function
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // move forward
        }

        return count;
    }

    public static void main(String[] args) {

        String mainStr = "banana";
        String subStr = "an";

        int result = countOccurrences(mainStr, subStr);

        System.out.println("Main String: " + mainStr);
        System.out.println("Substring: " + subStr);
        System.out.println("Occurrences: " + result);
    }
}