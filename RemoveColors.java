package oneb2;

import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue"
        colors.remove("Blue");

        // Display updated list
        System.out.println("After removing 2nd element and 'Blue': " + colors);
    }
}