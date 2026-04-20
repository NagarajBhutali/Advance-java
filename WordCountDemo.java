package threeC5;

import java.util.*;

public class WordCountDemo {

    // User-defined function
    public static int countWords(String str) {

        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        String input = "Java programming is very easy";

        int count = countWords(input);

        System.out.println("Input String: " + input);
        System.out.println("Number of words: " + count);
    }
}