package threeC1;

import java.util.*;

public class CapitalizeWordsDemo {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.split("\\s+");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                          + word.substring(1).toLowerCase() + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {

        String input = "java programming is easy";

        String output = capitalizeWords(input);

        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + output);
    }
}