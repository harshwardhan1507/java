package javakb.ch12_collections.set;

import java.util.LinkedHashSet;

/**
 * Demonstrates the LinkedHashSet class.
 * Key Concepts:
 * 1. Backed by a Hash table combined with a doubly-linked list running through it.
 * 2. Ordered: Preserves insertion-order of elements.
 * 3. Search, insert, and delete are O(1) constant time.
 * 4. Slightly higher memory overhead than HashSet due to maintaining pointers for insertion order.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // 1. Instantiating a LinkedHashSet
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>();

        // 2. Adding elements
        orderedSet.add("Zebra");
        orderedSet.add("Apple");
        orderedSet.add("Mango");
        orderedSet.add("Banana");

        // 3. Verifying order preservation
        // Unlike HashSet (which is unordered), LinkedHashSet prints elements in the exact order they were added.
        System.out.println("LinkedHashSet output (preserves insertion order):");
        System.out.println(orderedSet); 

        // Iteration matches insertion order
        System.out.print("Iteration order: ");
        for (String animal : orderedSet) {
            System.out.print(animal + " -> ");
        }
        System.out.println("end");
    }
}
