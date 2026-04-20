package oneC2;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> listobj = new LinkedList<>();

        // Add elements
        listobj.add("Apple");
        listobj.add("Banana");
        listobj.add("Orange");
        listobj.add("Mango");
        listobj.add("Grapes");

        // Display original list
        System.out.println("Original List: " + listobj);

        // Use descendingIterator() for reverse iteration
        Iterator<String> itr = listobj.descendingIterator();

        System.out.print("Reverse Order: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}