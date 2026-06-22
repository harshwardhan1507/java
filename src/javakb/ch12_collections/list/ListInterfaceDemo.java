package javakb.ch12_collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Demonstrates the core capabilities of the java.util.List interface.
 * Key Concepts:
 * 1. Ordered collection (preserves insertion order).
 * 2. Positional access (index-based operations starting from 0).
 * 3. Allows duplicates.
 * 4. Multiple iteration techniques (Iterator, ListIterator, for-each).
 */
public class ListInterfaceDemo {
    public static void main(String[] args) {
        // 1. Instantiating a List (Using ArrayList as the implementation)
        List<String> list = new ArrayList<>();

        // 2. Adding elements (add)
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple"); // Duplicates are allowed
        System.out.println("Initial List: " + list);

        // 3. Positional access (index-based)
        System.out.println("Element at index 1: " + list.get(1)); // Banana
        
        // Modifying an element at a specific index
        list.set(2, "Mango"); // Replaces Orange at index 2
        System.out.println("After modifying index 2: " + list);

        // 4. Checking existence and sizes
        System.out.println("List size: " + list.size());
        System.out.println("Contains 'Apple'? " + list.contains("Apple"));
        System.out.println("First index of 'Apple': " + list.indexOf("Apple"));
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // 5. Removing elements
        list.remove("Apple"); // Removes the first occurrence of "Apple"
        System.out.println("After removing 'Apple': " + list);
        list.remove(1); // Removes element at index 1 (Mango)
        System.out.println("After removing index 1: " + list);

        // Re-adding elements for iteration demo
        list.add("Grape");
        list.add("Strawberry");

        // 6. Iteration Methods
        System.out.println("\n--- Iteration Methods ---");

        // Method A: Enhanced for-loop (for-each)
        System.out.print("A. For-Each Loop: ");
        for (String item : list) {
            System.out.print(item + " -> ");
        }
        System.out.println("null");

        // Method B: Traditional Iterator
        System.out.print("B. Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " -> ");
        }
        System.out.println("null");

        // Method C: ListIterator (Supports bi-directional traversal)
        System.out.print("C. ListIterator (Forward): ");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " -> ");
        }
        System.out.println("null");

        System.out.print("D. ListIterator (Backward): ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " <- ");
        }
        System.out.println("start");
    }
}
