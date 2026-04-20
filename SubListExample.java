package oneB4;

import java.util.*;

public class SubListExample {
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

        // Extract 1st and 2nd elements (index 0 to 2)
        List<String> subList = colors.subList(0, 2);

        // Display extracted elements
        System.out.println("Extracted elements (1st & 2nd): " + subList);
    }
}