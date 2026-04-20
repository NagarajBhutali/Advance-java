package threeC3;

import java.util.*;

public class CheckNumeric {

    // User-defined function
    public static boolean isNumeric(String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input1 = "12345";
        String input2 = "12a45";

        System.out.println(input1 + " is numeric? " + isNumeric(input1));
        System.out.println(input2 + " is numeric? " + isNumeric(input2));
    }
}