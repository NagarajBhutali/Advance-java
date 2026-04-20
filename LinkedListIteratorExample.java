package oneC1;

import java.util.*;

public class LinkedListIteratorExample {
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

        // Create iterator starting at 2nd position (index 1)
        ListIterator<String> iteratorobj = listobj.listIterator(1);

        // Iterate from 2nd element
        System.out.print("Elements from 2nd position: ");
        while (iteratorobj.hasNext()) {
            System.out.print(iteratorobj.next() + " ");
        }
    }
}