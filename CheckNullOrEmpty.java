package threeB1;
import java.util.*;

public class CheckNullOrEmpty {

    // User-defined function
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {

        // Test cases
        String str1 = null;
        String str2 = "   ";
        String str3 = "Hello";

        // Checking strings
        System.out.println("str1: " + (isNullOrEmpty(str1) ? "Null or Empty" : "Valid"));
        System.out.println("str2: " + (isNullOrEmpty(str2) ? "Null or Empty" : "Valid"));
        System.out.println("str3: " + (isNullOrEmpty(str3) ? "Null or Empty" : "Valid"));
    }
}